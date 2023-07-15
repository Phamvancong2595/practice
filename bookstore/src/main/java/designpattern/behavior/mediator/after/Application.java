package designpattern.behavior.mediator.after;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {
    @Getter
    public static class Lane {
        private int vehicleCount;

       private final int number;

        public Lane(int number) {
            this.number = number;
        }
        public synchronized void increaseVehicleCount() {
            vehicleCount ++;
        }
        public synchronized void decreaseVehicleCount() {
            vehicleCount --;
        }
        public synchronized int getVehicleCount() {
            return vehicleCount;
        }
    }
    @AllArgsConstructor
    public static class Vehicle {
        private final int number;
        public void move(Lane lane) {
            System.out.println(
                    "Vehicle[" + number + "]: move on lane: "
                    + lane.getNumber()
            );
            lane.increaseVehicleCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
    public static class Mediator {
        private final Map<Lane, List<Vehicle>> vehiclesByLane = new HashMap<>();
        public synchronized void control (Lane lane, Vehicle vehicle) {
            vehiclesByLane
                    .computeIfAbsent(
                            lane,
                            k -> new ArrayList<>()
                    )
                    .add(vehicle);
            for (
                    Map.Entry<Lane, List<Vehicle>> e:
                    vehiclesByLane.entrySet()
            ) {
                final Lane laneKey = e.getKey();
                final List<Vehicle> vehicles = e.getValue();
                for (Vehicle v: vehicles) {
                    v.move(laneKey);
                    laneKey.decreaseVehicleCount();
                }
                vehicles.clear();
            }
        }
    }
    public static boolean isEveryLaneNotAvailable(Lane[] lanes) {
        for (Lane lane: lanes) {
            if (lane.getVehicleCount() == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        final Lane[] lanes = new Lane[2];
        for (int i = 0; i < lanes.length; ++i) {
            lanes[i] = new Lane(i + 1);
        }
        final AtomicInteger vehicleCount = new AtomicInteger();
        final Thread[] threads = new Thread[15];
        final Mediator mediator = new Mediator();
        for (int i = 0; i < threads.length; i ++) {
            threads[i] = new Thread(() -> {
                final Vehicle vehicle  = new Vehicle(
                        vehicleCount.incrementAndGet()
                );
                final int laneNumber =
                        ThreadLocalRandom.current().nextInt(lanes.length);
                mediator.control(lanes[laneNumber], vehicle);
                if (isEveryLaneNotAvailable(lanes)) {
                    System.out.println("Traffic Jam !!");
                }
            });
            threads[i].start();
        }
    }
}

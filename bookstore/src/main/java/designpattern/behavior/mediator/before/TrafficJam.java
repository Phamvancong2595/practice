package designpattern.behavior.mediator.before;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public final class TrafficJam {
    @Getter
    public static class Lane {
        private int vehicleCount;

        public Lane(int number) {
            this.number = number;
        }

        private final int number;
        public synchronized void increaseVehicleCount() {
            ++ vehicleCount;
        }
        public synchronized void decreaseVehicleCount() {
            -- vehicleCount;
        }
        public synchronized int getVehicleCount() {
            return vehicleCount;
        }
    }
    @AllArgsConstructor
    public static class Vehicle {
        private final int number;
        public void move(Lane lane) {
            System.out.println("Vehicle[" + number + "]: move on lane: " + lane.getNumber());
            lane.increaseVehicleCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static void main(String[] args) {
        final Lane[] lanes = new Lane[2];
        for (int i = 0; i < lanes.length; i ++) {
            lanes[i] = new Lane(i + 1);
        }
        final AtomicInteger vehicleCount = new AtomicInteger();
        final Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; ++i) {
            threads[i] = new Thread(
                    () -> {
                        final Vehicle vehicle = new Vehicle(
                                vehicleCount.incrementAndGet()
                        );
                        final int laneNumber =
                                ThreadLocalRandom.current()
                                        .nextInt(lanes.length);
                        final Lane lane = lanes[laneNumber];
                        vehicle.move(lanes[laneNumber]);
                        if (isEveryLaneNotAvailable(lanes)) {
                            System.err.println("Traffic Jam !!!");
                        }
                        lane.decreaseVehicleCount();
                    }
            );
            threads[i].start();
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
}

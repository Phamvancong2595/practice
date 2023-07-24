package designpattern.behavior.observer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> calculateSquare(15));
        future.thenAccept(result -> System.out.println("Square: " + result));
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
    public static int calculateSquare(int num) {
        return num * num;
    }
}

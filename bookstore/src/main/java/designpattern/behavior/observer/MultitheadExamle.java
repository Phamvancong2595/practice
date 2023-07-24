package designpattern.behavior.observer;

import org.eclipse.jetty.util.Callback;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

public class MultitheadExamle {
    public static class Calculator {
        public int sum(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final Calculator calculator = new Calculator();
        final Consumer<Integer> callback = sumResult -> System.out.println("Sum result: " + sumResult);
        final Thread newThread = new Thread(() -> {
           final int sumResult = calculator.sum(1,2);
           callback.accept(sumResult);
        });
        newThread.start();
        final CompletableFuture<Integer> future =  new CompletableFuture<>();
        final Thread thread = new Thread(() -> {
            final int sumResult = calculator.sum(1,2);
            future.complete(sumResult);
        });
        thread.start();
        final int result = future.get();
        System.out.println("Sum result: " + result);
    }
}

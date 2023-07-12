package main.java.org.core.concurrency.guardblocks;

import java.util.Random;

public class Producer implements Runnable{
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        String[] importantInfos = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();
        for (String importantInfo : importantInfos) {
            drop.put(importantInfo);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException ignored) {

            }
        }
        drop.put("DONE");
    }
}

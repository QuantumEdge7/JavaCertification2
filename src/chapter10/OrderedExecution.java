package chapter10;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderedExecution {
    private final AtomicInteger step = new AtomicInteger(1);

    public void first() {
        synchronized (this) {
            while (step.get() != 1) {
                try {
                    wait();
                    ;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread A executing...");
            step.incrementAndGet();
            notifyAll();
        }
    }

    public void second() {
        synchronized (this) {
            while (step.get() != 2) {
                try {
                    wait();
                    ;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread B executing...");
            step.incrementAndGet();
            notifyAll();
        }
    }

    public void third() {
        synchronized (this) {
            while (step.get() != 3) {
                try {
                    wait();
                    ;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread C executing...");
            step.incrementAndGet();
            notifyAll();
        }
    }

    public static void main(String[] args) {
        OrderedExecution orderedExecution = new OrderedExecution();
        Thread t1 = new Thread(orderedExecution::first);
        Thread t2 = new Thread(orderedExecution::second);
        Thread t3 = new Thread(orderedExecution::third);
        t3.start();
        t1.start();
        t2.start();
    }
}

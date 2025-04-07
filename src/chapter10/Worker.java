package chapter10;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker extends Thread {
    private CyclicBarrier barrier;
    private  int id;

    public Worker(CyclicBarrier barrier, int id){
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run(){
        try {
            System.out.println("Worker " + id + " is performing task...");
            Thread.sleep(1000 + (id*500));
            System.out.println("Worker " + id + " reached barrier.");
            barrier.await();
            System.out.println("Worker " + id + " is proceeding after barrier");
        } catch (InterruptedException | BrokenBarrierException ie){
            ie.printStackTrace();
        }
    }
}

package chapter10;

import java.util.concurrent.Callable;

public class WorkerTask implements Callable<String> {

    private final int taskId;

    public WorkerTask(int taskId) {
        this.taskId = taskId;
    }


    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Task " + taskId + " completed by " + Thread.currentThread().getName();
    }
}

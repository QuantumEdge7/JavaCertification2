package chapter10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    System.out.println("Initialization time for task name "
                            + name + " = " + sdf.format(new Date()));
                } else {
                    System.out.println("Executing time for task name " +
                            name + "= " + sdf.format(new Date()));
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

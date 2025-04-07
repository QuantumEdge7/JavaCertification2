package chapter10;

public class ShutDownHookDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("Shut down hook run this method."));
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(t1);
        try{
            System.out.println("Press ctr+c in command window to exit program.");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Calling System.exit()...");
        System.exit(0);
        System.out.println("After 3 second...");
    }
}

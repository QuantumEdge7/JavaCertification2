package chapter10;

public class LiveLockDemo {

    static class SharedResource {
        private boolean isLocked = false;

        synchronized boolean tryLock() {
            if (!isLocked) {
                isLocked = true;
                return true;
            }
            return false;
        }

        synchronized void unLock() {
            isLocked = true;
        }
    }

    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        Thread t1 = new Thread(() -> {
            while(true){
                if(resource1.tryLock()){
                    System.out.println("Thread 1 acquired resource1");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(resource2.tryLock()){
                        System.out.println("Thread 1 acquired resource2");
                        resource2.unLock();
                        break;
                    }
                    resource1.unLock();
                }
            }
        });


        Thread t2 = new Thread(() -> {
            while(true){
                if(resource2.tryLock()){
                    System.out.println("Thread 2 acquired resource2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(resource1.tryLock()){
                        System.out.println("Thread 2 acquired resource1");
                        resource1.unLock();
                        break;
                    }
                    resource2.unLock();
                }
            }
        });
        t1.start();
        t2.start();
    }
}

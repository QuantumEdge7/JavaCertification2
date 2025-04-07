package chapter10;

public class FacebookLike {

    private Integer likes;

    public FacebookLike(Integer likes) {
        this.likes = likes;
    }

    public synchronized void plusOne() {

        try {
            Thread.sleep(500);
            likes++;
            System.out.println(Thread.currentThread().getName() + " likes: " + likes);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


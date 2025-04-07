package chapter10;

public class FacebookLikeTest {

    public static void main(String[] args) {
        FacebookLike fb = new FacebookLike(500);
        Thread user1 = new Thread(fb::plusOne);
        Thread user2 = new Thread(fb::plusOne);
        Thread user3 = new Thread(fb::plusOne);
        Thread user4 = new Thread(fb::plusOne);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}

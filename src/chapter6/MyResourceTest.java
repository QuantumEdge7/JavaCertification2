package chapter6;

public class MyResourceTest {
    public static void main(String[] args) {

        try( MyResource resource = new MyResource()){ // try-with-resources
            resource.userResource();
        } catch (Exception e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}

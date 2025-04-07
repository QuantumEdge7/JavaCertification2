package chapter6;

//nested exception
public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            try {

            } catch (Exception e) {
            }
        } catch (Exception e) {
            try{

            } catch (Exception ex) {

            }
        }finally{
            try{

            } catch (Exception e) {

            }
        }

    }
}

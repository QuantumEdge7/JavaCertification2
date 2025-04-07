package chapter6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo8 {
    public static void main(String[] args) {
//        formatDate();
        try {
            parseDate();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void parseDate() throws ParseException {
        //string type
        String date = "01/11/2000";
        System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date parsedDate = dateFormat.parse(date);
        System.out.println(parsedDate);
    }

    public static void formatDate() {
        //date type
        Date currentDate = new Date();
        System.out.println(currentDate); //Mon Feb 10 17:22:57 CST 2025
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm a MM/dd/yyyy");

        //after format string type
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate); //17:22 PM 02/10/2025
    }
}

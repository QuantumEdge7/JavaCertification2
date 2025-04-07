package chapter8;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/print_demo.txt";
        File file = new File(filePath);
        //writing
        try (
                PrintWriter writer = new PrintWriter(new FileWriter(file));
        ) {
            writer.println("Name: Eliza");
            writer.println("Age: 23");
            writer.printf("Height: %.2f meter%n", 1.25);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //reading
        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

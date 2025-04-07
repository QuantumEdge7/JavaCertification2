package chapter8;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/pers.txt";
        File file = new File(filePath);
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        ) {
            Person person = new Person("John", 22);
            oos.writeObject(person);

            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

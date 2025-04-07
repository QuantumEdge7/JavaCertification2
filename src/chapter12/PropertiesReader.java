package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public static void main(String[] args) {
        Properties props = new Properties();
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/config.properties";
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            props.load(inputStream);

            String dbUrl = props.getProperty("database.url");
            String dbUsername = props.getProperty("database.username");
            String dbPassword = props.getProperty("database.password");
            String dbDriverName = props.getProperty("database.driver-name");

            System.out.println("Database URl: " + dbUrl);
            System.out.println("Database username: " + dbUsername);
            System.out.println("Database password: " + dbPassword);
            System.out.println("Database driver name: " + dbDriverName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

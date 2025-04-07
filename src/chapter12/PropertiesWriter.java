package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriter {

    public static void main(String[] args) {
        Properties props = new Properties();
        //setting properties(key-value pairs)
        props.setProperty("database.url", "jdbc:mysql://localhost:3306/test_db");
        props.setProperty("database.username", "root");
        props.setProperty("database.password", "root");
        props.setProperty("database.driver-name", "com.mysql.cj.jdbc.Driver");

        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/config.properties";
        try(FileOutputStream out = new FileOutputStream(filePath)){
            props.store(out, "Application Configuration");
            System.out.println("Properties file created successfully.");
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}


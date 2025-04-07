package chapter8;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo";
        File file = new File(filePath);
        file.mkdir();
    }
}

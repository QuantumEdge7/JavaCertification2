package chapter8;

import java.io.File;

public class ReadDir {
    public static void main(String[] args) {
        String folderPath = "C:/Users/zahee/OneDrive/Desktop/filedemo";
        File file = new File(folderPath);
        String[] paths = file.list();
        if (paths != null) {
            for (String path : paths) {
                System.out.println(path);
            }
        }

    }
}

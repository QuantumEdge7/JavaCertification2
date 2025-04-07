package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {
    public static void main(String[] args) {
        String fileReadPath = "C:/Users/zahee/OneDrive/Desktop/filedemo/intro.txt";
        String fileWritePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/copy1.txt";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(fileReadPath);
            fos = new FileOutputStream(fileWritePath);
            int len;
            while((len = fis.read()) != -1){
                System.out.println(len);
                fos.write(len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package chapter8;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {11, 21, 3, 40, 5};

            String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/output.txt";
            OutputStream os = new FileOutputStream(filePath);
            for (byte b : bWrite) {
                os.write(b);
            }
            os.close();

//            InputStream is = new FileInputStream(filePath);
//            for(int i = 0; i < is.available(); i++){
//                System.out.println((char)is.read()+" ");
//            }
//            is.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}

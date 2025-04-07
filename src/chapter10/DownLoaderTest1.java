package chapter10;

public class DownLoaderTest1 {

    public static void main(String[] args) {
        DownLoader1 d1 = new DownLoader1("url1");
        DownLoader1 d2 = new DownLoader1("url2");
        DownLoader1 d3 = new DownLoader1("url3");
        DownLoader1 d4 = new DownLoader1("url4");
        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
}

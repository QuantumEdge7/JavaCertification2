package chapter10;

public class DownLoader1 extends Thread {
    private String url;

    public DownLoader1(String url) {
        this.url = url;
    }

    public void run (){
        FileDownLoader fd = new FileDownLoader();
        fd.download(this.url);
    }
}

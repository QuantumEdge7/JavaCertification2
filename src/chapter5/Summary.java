package chapter5;

public class Summary {
    private String content;

    public Summary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "content='" + content + '\'' +
                '}';
    }
}

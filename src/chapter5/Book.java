package chapter5;

import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters;

    public Book(String title, List<Chapter> chapters) {
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}

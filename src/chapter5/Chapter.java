package chapter5;

import java.util.Optional;

public class Chapter {
    private String title;
    private Optional<Summary> summary; // Use Optional class instead of List

    public Chapter(String title, Summary summary) {
        this.title = title;
        this.summary = Optional.ofNullable(summary);
    }

    public String getTitle() {
        return title;
    }

    public Optional<Summary> getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", summary=" + summary +
                '}';
    }
}

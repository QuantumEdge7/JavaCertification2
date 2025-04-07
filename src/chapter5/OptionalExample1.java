package chapter5;

import java.util.List;
import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        Summary summary = new Summary("This is a summary of the chapter.");
        Chapter chapterWithSummary = new Chapter("chapter 1", summary);
        Chapter chapterWithoutSummary = new Chapter("chapter 2", null);
        Book book = new Book("Java book", List.of(chapterWithSummary, chapterWithoutSummary));


        book.getChapters().forEach(chapter -> {
            System.out.println("Title: " + chapter.getTitle());
            Optional<Summary> summary1 = chapter.getSummary();
            summary1.ifPresentOrElse(
                    summary2 -> System.out.println("Summary: " + summary2.getContent()),
                    () -> System.out.println("Summary: summary no available")
            );
        });

    }
}

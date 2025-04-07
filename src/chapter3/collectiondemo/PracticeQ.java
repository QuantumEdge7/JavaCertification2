package chapter3.collectiondemo;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PracticeQ {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG");
        codes.forEach (c -> System.out.print(c + " "));
        String fmt = codes.stream()
                .filter (s-> s.contains ("PEG"))
                .reduce((s, t) -> s + t).get();
        System.out.println("\n" + fmt);

        List<String> nL = Arrays.asList("Jim ", "John ", "Jeff");
        Function<String, String> funVal = s -> "Hello : ".concat(s);
        nL.stream()
                .map(funVal)
                .forEach(s-> System.out.print (s));
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparisonDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Hari","Shyam");
        names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }
}

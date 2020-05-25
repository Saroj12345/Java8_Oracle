import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10,20,30,40);

        System.out.println(integerList.stream().collect(Collectors.averagingInt(Integer::intValue)));


        System.out.println(integerList.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics());
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("11112","22223","33334","444567","888889");
        List<String> list2 = Arrays.asList("33334","22223","11112","444567");

        List<String> filteredItems = list1.stream().filter(item1 -> list2.stream().anyMatch(item2 -> item2.equalsIgnoreCase(item1))).collect(Collectors.toList());

        for(String item : filteredItems) {
            System.out.println(item);
        }

    }
}

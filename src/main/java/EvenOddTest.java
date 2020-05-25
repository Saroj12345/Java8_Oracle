import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddTest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10,20,30,11);




        //List<Integer> filteredList= integerList.stream().filter(integer -> integer%2==0? new StringBuffer(integer.toString()).append("a"):false).collect(Collectors.toList());

        List<String> numList = new ArrayList<>();
        String even = "e";
        String odd = "o";
        integerList.stream().forEach(integer -> {

            if(integer%2==0) {
                numList.add(even.concat(integer.toString()));
            }else {
                numList.add(odd.concat(integer.toString()));
            }
        });

        System.out.println(numList);
    }
}

import java.util.Arrays;
import java.util.List;

public class ArraySumUsingReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,10,11,20,30,40);

        System.out.println(numbers.stream()
                .filter(num -> num%2==0)
                .map(num -> num*2)
                .reduce(1 , Integer::sum));

        numbers.forEach(number -> {
            if(number>0) {
                System.out.println();
            }
        });
    }
}

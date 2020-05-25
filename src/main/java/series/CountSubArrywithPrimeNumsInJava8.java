package series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSubArrywithPrimeNumsInJava8 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 2, 3, 4, 8, 7, 9, 5};

        //List<Integer>  dataList = IntStream.of(array).boxed().collect(Collectors.toList());

        Arrays.asList(array).stream().forEach(ints -> {
            List<Integer> dataList = new ArrayList<>();
            for (int num : ints) {
                if (num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0)) {
                    dataList.add(num);
                }
            }
            System.out.println(dataList);
        });
        //System.out.println(list.count());
    }


}
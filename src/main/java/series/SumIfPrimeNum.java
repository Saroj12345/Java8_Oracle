package series;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumIfPrimeNum {

    public static void main(String[] args) {

        int[] dataArray = new int[]{1, 4, 7, 8, 4, 3, 5, 9, 4, 7, 7};

        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int number : dataArray) {
            if (dataMap.containsKey(number)) {
                dataMap.put(number, dataMap.get(number) + 1);
            } else {
                dataMap.put(number, 1);
            }
        }
        System.out.println(dataMap);
        System.out.println(dataMap.entrySet().stream().filter(entry-> isPrime(entry)).mapToInt(Map.Entry::getKey).sum());


       /* for(int i=0;i<=num/2;i++) {

        }*/
    }

    private static boolean isPrime(Map.Entry<Integer, Integer> entry) {
        return entry.getValue()>1 && IntStream.range(2,entry.getValue()).noneMatch(i -> entry.getValue()%i==0);
    }


}

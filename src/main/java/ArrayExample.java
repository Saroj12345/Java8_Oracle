import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 6, 4, 1, 2};


        int missingNum = missingNum(array);
        System.out.println(missingNum);
       /* List<Integer> x = Arrays.asList(-1,-3);
        int length = x.size();

        int total = length * (length+1)  / 2 ;

        int sum = x.stream()
                .sorted()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(total-sum);*/





    }

    private static int missingNum(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N +1 ; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}

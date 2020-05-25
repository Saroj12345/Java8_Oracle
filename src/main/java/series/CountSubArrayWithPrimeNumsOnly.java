package series;

import java.util.ArrayList;
import java.util.List;

public class CountSubArrayWithPrimeNumsOnly {


    //wrong logic
    public static void main(String[] args) {
        int[] array = new int[]{6, 2, 3, 4, 8, 7, 9, 5, 1, 0};

        List<Integer> dataList = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {

            int num = array[i];
            flag = false;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && num != 0 && num != 1) {
                dataList.add(num);
            }

        }
        System.out.println(dataList);
    }


}

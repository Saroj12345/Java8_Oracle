package array;

public class PrimeNumInARange {


    public static void main(String[] args) {

        int start = 2;
        int end = 100;
        boolean flag = false;
        while (start < end) {

            flag = false;
            for (int i = 2; i <= start / 2; i++) {
                if (start % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && start != 0 && start != 1) {
                System.out.print(start+" ");
            }
            start++;
        }
    }
}

package array;

public class GCDInARange {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6, 8, 12, 15};

        int num1 = arr[0];
        int gcd = 1;
        for (int i = 1; i < arr.length; i++) {
            int num2 = arr[i];
            for (int j = 1; j <= num1 && j <= num2; j++) {
                if (num1 % j == 0 && num2 % j == 0) {
                    gcd = j;
                    //num1 = gcd;
                }
            }
            num1 = gcd;
        }
        System.out.println(gcd);
    }
}

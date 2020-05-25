package array;

public class FindSum {
    public static void main(String[] args) {

        int n = 100;

        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        int sum = 0;
        int a = 1, b = 2, c = 3;
        for (int i = 1; i <= n; i++) {
            if (i < 4) {
                sum = sum + i;
            } else {
                sum = (a + b + c);
                a=b;
                b=c;
                c=sum;
            }
        }
        return sum;
    }
}

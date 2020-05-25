public class GCDOfTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int gcd = findGCDOfTwoNumbers(a, b);
        System.out.println(gcd);
    }

    private static int findGCDOfTwoNumbers(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return findGCDOfTwoNumbers(b, a % b);
        }
    }
}

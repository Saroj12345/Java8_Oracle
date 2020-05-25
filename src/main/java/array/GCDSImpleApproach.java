package array;


// GCD Of two numbers is that greatest number that devides both the number without remainder
public class GCDSImpleApproach {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}

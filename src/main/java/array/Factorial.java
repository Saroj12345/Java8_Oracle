package array;

public class Factorial {

    static int fact=1;

    public static void main(String[] args) {

        int num =6;
        fact(num);
        System.out.println(fact);
    }

    private static void fact(int num) {

        if(num>1) {
            fact = fact * num;
            fact(num-1);
        }

    }
}

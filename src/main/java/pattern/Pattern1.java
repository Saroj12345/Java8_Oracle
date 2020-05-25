package pattern;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Rows you want");
        int rows = scanner.nextInt();
        System.out.println("Below is your pattern");
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

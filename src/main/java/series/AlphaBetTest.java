package series;

import java.util.Scanner;

public class AlphaBetTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            String s = scanner.next();
            isValid(s);
            }
        }


    private static boolean isValid(String s) {
        if(s.matches("[0-9]+")) {
            System.out.println("valid Format");
            return true;
        }
        else if (s.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Format Alphabet");
            throw new AlphaBetException(s);
        }
        else if(s.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Invalid Format AlphaNumeric");
            throw new AlphaNumericException(s);
        }

        return false;
    }
}

class AlphaBetException extends RuntimeException {

    public AlphaBetException(String message) {
        super(message);
    }
}

class AlphaNumericException extends RuntimeException {

    public AlphaNumericException(String message) {
        super(message);
    }
}

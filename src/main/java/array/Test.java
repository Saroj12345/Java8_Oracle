package array;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try {
            method1();
        }
        catch (Exception e) {

        }

    }

    private static void method1() {

        try{
            throw new IOException();
        } catch (IOException e) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}

public class RegxTest {

    public static void main(String[] args) {
        String str = "sdgstdxg45656";
        String regx = "[A-Za-z0-9]+";

        if(str.matches(regx)) {
            System.out.println("No Special Chars found");
        } else {
            System.out.println("Special Chars found");

        }
    }
}

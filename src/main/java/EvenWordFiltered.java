public class EvenWordFiltered {


    public static void main(String[] args) {
        String str = "How are you Boss Babu";
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            if (s.length() % 2 == 0) {
                System.out.print(s + " ");
            }
        }

    }
}

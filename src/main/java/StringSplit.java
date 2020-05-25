public class StringSplit {

    public static void main(String[] args) {
        String str = "Hello*#123";
        String[] part = str.split("(?<=\\D)(?=\\d)");
        //System.out.println(part[0].split("[A-Za-z0-9]"));
        String [] x = part[0].split("[^A-Za-z0-9]");
        System.out.println(x[0]);
        System.out.println(part[1]);
    }
}

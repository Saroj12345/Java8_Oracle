public class StringTest {

    public static void main(String[] args) {

        String s1 = "India";
        String s2 = s1.concat("Bangla");
        System.out.println(s2+" "+s1);

        StringBuilder s3 = new StringBuilder("Pak");
        StringBuilder s4 = s3.append("China");
        System.out.println(s4+" "+s3);

    }
}

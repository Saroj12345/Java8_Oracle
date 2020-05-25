import java.util.HashMap;
import java.util.Map;

public class AnagramString {

    public static void main(String[] args) {

        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        Map<Character,Integer> dataMap1 = new HashMap<>();
        Map<Character,Integer> dataMap2 = new HashMap<>();

        char[] chrArray1 = s1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] charArray2 = s2.replaceAll("\\s","").toLowerCase().toCharArray();

        for(Character c : chrArray1) {
            if(dataMap1.containsKey(c)) {
                dataMap1.put(c,dataMap1.get(c)+1);
            } else {
                dataMap1.put(c,1);
            }
        }
        for(Character c : charArray2) {
            if(dataMap2.containsKey(c)) {
                dataMap2.put(c,dataMap2.get(c)+1);
            } else {
                dataMap2.put(c,1);
            }
        }

        System.out.println(dataMap1);
        System.out.println(dataMap2);

        System.out.println(dataMap1.equals(dataMap2));

    }
}

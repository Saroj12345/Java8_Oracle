package series;

public class Automorphic_Num {

    public static void main(String[] args) {
        int num = 76;
        int squre = (int) Math.pow(num,2);
        //System.out.println(squre);
       String number =  Integer.toString(num);
       String squr_num = Integer.toString(squre);
       if(squr_num.endsWith(number)) {
           System.out.println("AutoMorphic");
       }
       else {
           System.out.println("Not AutoMorphic");
       }
    }


}

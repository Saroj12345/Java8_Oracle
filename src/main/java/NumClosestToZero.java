public class NumClosestToZero {

    public static void main(String[] args) {

        int[] arr = new int[]{-10,-10,-10};
        System.out.println(closest(arr));


    }

    static int closest(int[] array) {
        if(array.length==0) {
            return 0;
        }
        int num = array[0];
        int absNum = Math.abs(num);
        for (int i = 1; i < array.length; ++i) {
            int newAbs = Math.abs(array[i]);
            if(newAbs == absNum) {
                num = array[i];
            }
            else if (newAbs < absNum) {
                absNum = newAbs;
                num = array[i];
            }
        }
        return num;
    }
}

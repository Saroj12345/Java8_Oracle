public class GCDinAnArray {

    public static void main(String[] args) {

        int arr[] = {2,4,7,8,16};

        int result = arr[0];
        int num=0;
        for(int i=1;i<arr.length;i++) {

            result = findGCDOfTwoNumbers(arr[i],result);
            if(result==1) {
                System.out.println(result);
                return;
            }
        }
        System.out.println(result);
        //findGCDOfTwoNumbers()

    }

    private static int findGCDOfTwoNumbers(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return findGCDOfTwoNumbers(b, a % b);
        }
    }
}

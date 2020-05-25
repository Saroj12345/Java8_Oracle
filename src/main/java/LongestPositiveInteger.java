public class LongestPositiveInteger {
    public static void main(String[] args) {

        int[] arr = new int[100];

        int n= 1041;

        int i=0;
        while (n > 0) {

            arr[i] = n % 2;
            n = n / 2;
            i++;

        }

        for(int j=i-1;j>=0;j--) {

            System.out.print(arr[j]+" ");

            /*if(arr[j]!=1) {
                count++;
            }*/
        }
    }
}

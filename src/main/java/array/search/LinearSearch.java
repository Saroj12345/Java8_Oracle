package array.search;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = new int[]{10,15,20,25,30};

        int key = 20;

        for(int i=0;i<arr.length;i++) {

            if(arr[i]==key) {
                System.out.println("Key "+key+" is Found at "+(i+1)+ " location");
                break;
            }
        }
    }
}

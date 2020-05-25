package array.search;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = new int[]{10,15,20,25,30};

        int key = 1;

        int low=0;
        int high = arr.length-1;


        for(int i=0;i<arr.length;i++) {

            int mid = (low+high)/2;

            if(arr[mid]==key) {
                System.out.println("Element "+key+ " Found at "+(mid+1)+" location");
                break;
            }
            else if(arr[mid] < key) {
                 low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
    }
}

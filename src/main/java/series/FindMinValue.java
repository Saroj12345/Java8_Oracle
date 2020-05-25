package series;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMinValue {

    public static void main(String[] args) {

        int[] arr1 = new int[]{-4,3,2,1};
        List<Integer> arr= IntStream.of(arr1).boxed().collect(Collectors.toList());
        int count=0;
        long finalValue=0;
        for(int x=1;x<100;x++) {
            int sum=x+arr.get(0);
            if(sum>0) {
                for(int i=1;i<arr.size();i++) {
                    sum= sum+arr.get(i);
                    if(sum<0) {
                        //x++;
                        break;
                    } else if(sum>0) {
                        count++;
                        if(count==arr.size()-1) {
                            finalValue = x;
                        }
                    }
                }
            }
            if(finalValue!=0) {
                break;
            }
        }
        System.out.println(finalValue);
    }

}

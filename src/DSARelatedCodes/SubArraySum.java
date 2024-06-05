package DSARelatedCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//you have an array here let array be [1,2,3,4,5] we have to find how many  subarrays will be there that will sum up
// with 7
public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,2,4,1};
        int target = 5;
        System.out.println(findSubArraySum(arr,target));
    }
    public static int findSubArraySum(int[] arr, int target){
        Map<Integer, Integer> mp = new HashMap<>();
        int count=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==target){
//                return new  int[] {0,i};
                count++;
            }
            if(mp.containsKey(sum-target)){
    //                return new int[] {mp.get(sum-target)+1,i};
                count++;

            }
            mp.put(sum,i);
        }
//        return new int[]{-1,-1};
          return count;

    }
}

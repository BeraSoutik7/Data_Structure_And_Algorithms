package DSARelatedCodes;

import java.util.HashMap;

public class SubArraySumZero {
    public static boolean subArraySumZero(int[] arr, int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(mp.containsKey(sum) || sum==0){
                return true;
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={4,2,-3,1,6};
        System.out.println(subArraySumZero(arr,arr.length));
    }
}

package DSARelatedCodes;

import java.util.HashMap;

public class LongestSubArraySum {
    public static int  longestSubArraySumBrute(int arr[],int n,int key){
        int maxLen=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
                sum=0;
            for (int j = i; j < n; j++) {
               sum+=arr[j];

                if(sum==key){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }

        }
        return maxLen;
    }
    public static int longestSubArraySumHash(int arr[],int n, int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                len=Math.max(len,i+1);
            }
            if(mp.containsKey(sum-k)){
                len=Math.max(len,i-mp.get(sum-k));

            }

            mp.putIfAbsent(sum,i);

        }
        return len;
    }
    public static int longestSubArraySumOnlyPositive(int arr[], int n, int k){
        int i=0;
        int j=0;
        int sum=0;
        int len=0;
        while(j<n ){
            sum+=arr[j];
            if(sum==k){
                len=Math.max(len,j-i+1);
                j++;
            }
            else if(sum>arr[j]){
                j++;
            }
            else{
                i--;
            }

        }
        return len;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,3};
        System.out.println(longestSubArraySumBrute(arr,arr.length,3));
        System.out.println(longestSubArraySumHash(arr,arr.length,3));
        System.out.println(longestSubArraySumOnlyPositive(arr,arr.length,3));
    }
}

package DSARelatedCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArraysInGroup {
    public static void reverseArray(int[] arr , int k, int n){
       int start=-1;
       int end=-1;
        for (int i = 0; i < n; i++) {
            start = i;
            end   = Math.min(i+k-1,n-1);
            while(start<= end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }
}

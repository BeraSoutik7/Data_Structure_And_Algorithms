package DSARelatedCodes;

import java.util.*;

public class MinNumbersOfPlatform {
    public static int findPlatform(int[] arr, int dep[], int n){
        int numPlatform=1;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i]>=arr[j] && dep[i]<=dep[j]) || arr[i]<arr[j] && dep[i]>dep[j]){
                    numPlatform++;
                }
            }
        }
        return numPlatform;
    }
    public static int findPlatformOptimized(int arr[],int dep[],int n){
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        Arrays.sort(dep);
        //System.out.println(Arrays.toString(dep));
        int i=0;
        int j=0;
        int numPlatform=1;
        int ans=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                i++;
                numPlatform++;
            }
            else {
                j++;
                numPlatform--;
            }
            ans=Math.max(ans,numPlatform);
        }
        return numPlatform;

    }
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(findPlatform(arr,dep,arr.length));
        System.out.println(findPlatformOptimized(arr,dep,arr.length));

    }
}

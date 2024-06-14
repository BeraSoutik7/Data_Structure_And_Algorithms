package DSARelatedCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindFourSum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int key) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer> s = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum = arr[i]+arr[j]+arr[k];
                    long forth = key-sum;
                    if(s.contains(forth)){
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[k]);
                        a.add((int)forth);
                        Collections.sort(a);
                        ans.add(a);
                    }
                    s.add((int)forth);

                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int A[] = {10,2,3,4,5,7,8};
        System.out.println(fourSum(A,23));
    }
}

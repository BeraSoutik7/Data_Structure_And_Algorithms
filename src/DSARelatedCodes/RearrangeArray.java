package DSARelatedCodes;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;

public class RearrangeArray {
    public static void rearrangeArray(int arr[], int n){
        ArrayList<Integer>  pos = new ArrayList<>();
        ArrayList<Integer>  neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int j=0;
        int k=0;
        int i =0;
        for (i = 0; i < n; i++) {
            if(i%2==0){
                arr[i]=pos.get(j);
                j++;
            }
            else{
                if(k<neg.size()) {
                    arr[i] = neg.get(k);
                    k++;
                }
                else{
                    break;
                }
            }

        }
        while(i<n){
            arr[i]=pos.get(k);
            k++;
            i++;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int []arr = {-5 ,-2 ,5 ,2 ,4 ,7 ,1, 8, 0, -8};
        rearrangeArray(arr,arr.length);
    }
}

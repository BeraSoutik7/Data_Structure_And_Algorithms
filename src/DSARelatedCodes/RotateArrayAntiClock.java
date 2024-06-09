package DSARelatedCodes;
import java.util.*;
import java.lang.reflect.Array;

public class RotateArrayAntiClock {
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        int ans[] = new int[n];
        d=d%n;
        for(int i=0;i<n;i++){

            ans[(i+n-d)%n]=arr[i];

        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(arr));
        rotateArr(arr,2,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

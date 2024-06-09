package DSARelatedCodes;
import java.util.*;
public class ZigZagArray {
    public static void zigzagArray(int[] arr,int n){
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(flag == 0){
                if(arr[i]>arr[i+1]){
                    swapElements(arr,i,i+1);
                }
                flag=1;
            }
            else if(flag == 1){
                if(arr[i]<arr[i+1]){
                    swapElements(arr,i,i+1);
                }
                flag=0;
            }
        }
    }
    public static void swapElements(int arr[], int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};
        System.out.println(Arrays.toString(arr));
        zigzagArray(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

package SortingAlgorithm;
import java.util.*;
public class QSort {
    public static void sort(int[] arr, int l, int r){
        if(l<r) {
            int partition = partition(arr, l, r);

            sort(arr,l,partition-1);
            sort(arr,partition+1,r);
        }
    }
    public static int partition(int arr[], int l, int r){
        int i=l;
        int j=r;
        int pivot = l;

        while(i<j){
            while(i<=r && arr[i]>=arr[pivot]){
                i++;
            }
            while(j>=l && arr[j]<arr[pivot]){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j]=temp;


        return j;
    }
    public static void main(String[] args) {
        int arr[] ={2,7,1,9,6};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

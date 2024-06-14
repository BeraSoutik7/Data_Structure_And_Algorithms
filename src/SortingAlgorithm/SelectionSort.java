package SortingAlgorithm;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for (int j = i+1; j < n; j++) {
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {64,24,12,22,11};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,arr.length);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}

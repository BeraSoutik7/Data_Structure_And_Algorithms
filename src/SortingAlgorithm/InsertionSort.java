package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j-- ;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {64,24,12,22,11};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr,arr.length);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}

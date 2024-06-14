package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64,24,12,22,11};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}

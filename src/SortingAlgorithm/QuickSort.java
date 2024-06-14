package SortingAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);

            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int i=low;
        int j=high;
        int pivot=low;

        while(i<j){
            while( i<=high && arr[i]<=arr[pivot]){
                i++;
            }
            while(j>=low && arr[j]>arr[pivot]){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[pivot];
        arr[pivot] =arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {64,24,12,22,11};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}

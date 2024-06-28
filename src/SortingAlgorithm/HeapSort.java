package SortingAlgorithm;
import java.util.*;
public class HeapSort {
    public static void buildHeap(int arr[], int n){
        for (int i = n/2-1; i >=0 ; i--) {
            heapifyMax(arr,n,i);
        }
    }
    public static void heapifyMax(int arr[], int n, int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(i!=largest){
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest] = temp;
            heapifyMax(arr,n,largest);
        }

    }
    public static void heapSort(int arr[], int n){
        buildHeap(arr,n);
        int t = n;
            while(n!=0) {
                int temp = arr[0];
                arr[0] = arr[n - 1];
                arr[n - 1] = temp;
                n--;
                heapifyMax(arr, n, 0);
            }

//        for (int i = 0; i < t/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[t-1-i];
//            arr[t-1-i] = temp;
//        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[] = {10,50,20,40,60};
        //buildHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));
        heapSort(arr,arr.length);

    }
}

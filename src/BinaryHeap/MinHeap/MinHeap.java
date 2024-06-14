package BinaryHeap.MinHeap;
import java.util.*;

public class MinHeap {
    static int[] arr;
    static int capacity;
    static int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        this.capacity=capacity;
        size=0;
    }
    public static int left(int i){
        return i*2+1;
    }
    public static int right(int i){
        return i*2+2;
    }
    public static int parent(int i){
        return (i-1)/2;
    }
    public static void insert(int data){
        size++;
        arr[size-1]=data;
        int root = arr[0];
        int nodeIndex=size-1;
        while(nodeIndex!=0 && arr[nodeIndex]<arr[parent(nodeIndex)]){
             int temp=arr[nodeIndex];
             arr[nodeIndex]=arr[parent(nodeIndex)];
             arr[parent(nodeIndex)]=temp;
             nodeIndex=parent(nodeIndex);
        }

    }
    public static void minHeap(int arr[]){
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            minHeapifyRec(arr, i);
        }

    }
    public static void minHeapifyRec(int arr[],int i){
        if(i>arr.length){
            return;
        }
        int left = left(i);
        int right = right(i);
        int smallest = i;
        if(left<arr.length && arr[left]<arr[smallest]){
            smallest = left;
        }
        if(right<arr.length && arr[right]<arr[smallest]){
            smallest = right;
        }
        if (smallest!=i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapifyRec(arr,smallest);
        }


    }
    public static void maxHeapifyRec(int arr[], int i){
        if(i>arr.length){
            return;
        }
        int left = left(i);
        int right = right(i);
        int largest = i;

        if(left<arr.length && arr[largest]<arr[left]){
            largest=left;
        }
        if(right<arr.length && arr[largest]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapifyRec(arr,largest);
        }
        maxHeapifyRec(arr,left);
        maxHeapifyRec(arr,right);
    }


}

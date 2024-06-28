package BinaryHeap.MinHeap;
import java.util.*;

public class MinHeap {
    static int[] arr;
    static int capacity;
    static int size=0;

    public static void setCapacity(int data){
        capacity = data;
        arr = new int[capacity];
        size = 0;
    }
    public static void printHeap(){
       int i=0;
        System.out.print("[");
       while(i<size){
           System.out.print(arr[i]+" ");
           i++;
       }
        System.out.print("]");
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
        if(size>capacity-1){
            System.out.println("Not possible");
            return;
        }
        size++;
        arr[size-1]=data;
        int nodeIndex=size-1;
        while(nodeIndex!=0 && arr[nodeIndex]<arr[parent(nodeIndex)]){
             int temp=arr[nodeIndex];
             arr[nodeIndex]=arr[parent(nodeIndex)];
             arr[parent(nodeIndex)]=temp;

             nodeIndex=parent(nodeIndex);
        }

    }
    public static void minHeap(){
        for (int i = size / 2 - 1; i >= 0; i--) {
            minHeapifyRec(arr, i);
        }

    }
    public static void minHeapifyRec(int arr[],int i){

        int left = left(i);
        int right = right(i);
        int smallest = i;
        if(left<size && arr[left]<arr[smallest]){
            smallest = left;
        }
        if(right<size && arr[right]<arr[smallest]){
            smallest = right;
        }
        if (smallest!=i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapifyRec(arr,smallest);
        }


    }
    public static void maxHeap(){
        for (int i = size/2-1 ; i >=0 ; i--) {
            maxHeapifyRec(arr,i);
        }
    }
    public static void maxHeapifyRec(int arr[], int i){
        int left = left(i);
        int right = right(i);
        int largest = i;

        if(left<size && arr[largest]<arr[left]){
            largest=left;
        }
        if(right<size && arr[largest]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapifyRec(arr,largest);
        }
    }
    public static int getMin(){
        if(size == 0){
            System.out.println("Empty");
            return Integer.MAX_VALUE;
        }
        return arr[0];
    }
    public static int extractMin(){
        if(size == 0){
            System.out.println("Empty");
            return Integer.MAX_VALUE;
        }

        int temp = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = temp;

        size--;
        minHeapifyRec(arr,0);
        return temp;
    }
    public static void changeHeap(int index, int val){
        arr[index]=val;
    }

    public static void decreaseKey(int i, int data){
        if(i>=size){
            System.out.println("Not possible");
            return ;
        }
        arr[i] = data;
        minHeap();


    }
    public static void deleteKey(int i){
        if(i>=size){
            System.out.println("Not possible");
            return ;
        }
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();

    }
    public static void heapSort(){
//        int temp[] = new int[size];
//        int i=0;
//        while(size>0){
//            temp[i]=extractMin();
//            i++;
//        }
//        return temp;
        //buildHeap(arr,n);
        int t = size;
        while(t!=0){
            int temp=arr[0];
            arr[0]=arr[size-1];
            arr[size-1]=temp;
            t--;
            minHeapifyRec(arr,0);
        }

        
        reverseArray(arr, size);


    }
    public static void reverseArray(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }


}

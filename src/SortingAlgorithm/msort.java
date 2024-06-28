package SortingAlgorithm;
import java.util.*;
public class msort {
    public static void sort(int[] arr , int l,int r){
        if(l<r){
            int m=l+(r-l)/2;

            sort(arr,l,m);

            sort(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }
    public static void merge(int[] arr , int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i]=arr[l+i];
        }
        for (int i=0;i<n2;i++){
            R[i]=arr[i+m+1];
        }
        int i =0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]>=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,1,9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

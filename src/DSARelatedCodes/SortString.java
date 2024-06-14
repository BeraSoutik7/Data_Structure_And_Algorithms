//package DSARelatedCodes;
//import java.util.*;
//public class SortString {
//    static String sort(String s)
//    {
//        // code here
//        String []str =s.split("");
//        mergeSort(str,0,str.length-1);
//
//        return Arrays.toString(str);
//
//    }
//    public static void mergeSort(String[] arr,int l,int r){
//        if(l<r){
//            int m = l + (r - l) / 2;
//
//
//            mergeSort(arr, l, m);
//            mergeSort(arr, m + 1, r);
//
//            merge(arr,l,m,r);
//
//        }
//    }
//    public static void merge(String[] arr,int l,int m,int r){
//        int n1 = m-l+1;
//        int n2 = r-m;
//
//        String L[] = new String[n1];
//        String R[] = new String[n2];
//
//        for (int i = 0; i < n1; i++) {
//            L[i]=arr[l+i];
//        }
//        for (int i = 0; i < n2; i++) {
//            R[i]=arr[m+1+i];
//        }
//        int i=0;
//        int j=0;
//        int k=l;
//        while(i<n1 && j<n2){
//            if(L[i]<=R[j]){
//                arr[k]=L[i];
//                i++;
//            }
//            else{
//                arr[k]=R[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i<n1){
//            arr[k]=L[i];
//            i++;
//            k++;
//        }
//        while(j<n2){
//            arr[k]=R[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void main(String[] args) {
//        sort()
//    }
//}

package SearchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr,int l,int r, int key){
        if(l>r){
            return -1;
        }
        int m = l+(r-l)/2;
        if(arr[m]==key){
            return m;
        }
        else if(arr[m]>key){
            return binarySearch(arr,l,m-1,key);
        }
        else{
            return binarySearch(arr,m+1,r,key);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s  = sc.nextLine();
        String str[] = s.split("\\s+");
        int arr[] = new int [str.length];
        for(int i =0 ;i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int key =sc.nextInt();
        System.out.println(binarySearch(arr, 0,arr.length-1,key));
    }
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        return search(arr,0,arr.length-1,k,Integer.MAX_VALUE);

    }
    public static int search(int arr[], int l, int r,int k, int res){
        int m = l+(r-l)/2;
        res = Math.min(res,Math.abs(arr[m]-k));
        if(l>r){
            return res;
        }
        if (arr[m]>k){
            return search(arr,0,m-1,k,res);
        }
        else{
            return search(arr,m+1,r,k,res);
        }
    }
}

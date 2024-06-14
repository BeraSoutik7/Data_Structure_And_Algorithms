package DSARelatedCodes;

import java.util.HashMap;
import java.util.HashSet;

public class CountPair {
    public static int countPair(int[] arr,int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count   = 0;
        for (int i = 0; i < arr.length; i++) {
            if(mp.containsKey(k-arr[i])){
                count+=mp.get(k-arr[i]);
                
            }
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,1};
        System.out.println(countPair(arr,6));
//        HashSet<Integer> s = new HashSet<>();
//        for (int i: arr) {
//            s.add(i);
//        }
//
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//
//            if(s.contains(k-arr[i])){
//                s.remove(arr[i]);
//                count++;
//            }
//        }
//        return count;
    }
}

package DSARelatedCodes;
import java.util.*;
//There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths.
//The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes.
public class MInCost {
    public static  long minCost(int arr[] , int n){
        long cost = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i : arr) {
            ans.add(i);
        }
        //System.out.println(ans);
        long sum=0;
        while(ans.size()!=1){
            Collections.sort(ans);
            //System.out.println(ans);
            sum=ans.get(0)+ans.get(1);
            int t=2;
            while(t!=0){
                t--;
                ans.remove(0);
            }

            ans.add((int)sum);
            //System.out.println(ans+"end");
            cost+=sum;
        }
        return cost;
    }
    public static long optimizedMinCost(long arr[],int n){
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        // Add all elements to the min-heap
        for (long num : arr) {
            minHeap.add(num);
        }

        long cost = 0;

        // Combine ropes until one rope remains
        while (minHeap.size() > 1) {
            // Extract the two smallest elements
            long first = minHeap.poll();
            long second = minHeap.poll();

            // Sum the two smallest elements
            long sum = first + second;

            // Add the sum back to the min-heap
            minHeap.add(sum);

            // Add the sum to the total cost
            cost += sum;
        }

        return cost;
    }
    public static void main(String[] args) {
        int arr[] ={4, 2, 7, 6, 9};
        System.out.println(minCost(arr,arr.length));
    }
}

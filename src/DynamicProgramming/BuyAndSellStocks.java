package DynamicProgramming;

public class BuyAndSellStocks {
    public static int maxProfit(int a[],int n){
        int min=a[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost = a[i]-min;
            profit = Math.max(profit,cost);
            min = Math.min(a[i],min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,6,9};
        System.out.println(maxProfit(arr,arr.length));
    }
}

package DSARelatedCodes;

public class SmallestSubArrayWithSumGreaterThanX {
    public static int smallestSubWithSumOpt(int arr[],int n, int x){
        int start=0;
        int end=0;
        int min=n+1;
        int sum=0;
        while(end!=n && start!=n){

            if(sum>x){
                min = Math.min(min,end-start);
                //System.out.println(end-start);
                sum-=arr[start];
                start++;
            }
            else{
                sum+=arr[end];
                end++;
            }
        }
        return min;
    }
    public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here

        int min=n+1;
        for(int i=0;i<n;i++){
            int current = arr[i];
            if(current > x){
                return 1;
            }
            for(int j=i+1;j<n;j++){
                current+=arr[j];
                if(current>x && min>j-i+1){
                    min=j-i+1;
                }
            }
        }
        if(min==n+1){
            return 0;
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] ={1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(arr,arr.length,51));
        System.out.println(smallestSubWithSumOpt(arr,arr.length,51));
    }
}

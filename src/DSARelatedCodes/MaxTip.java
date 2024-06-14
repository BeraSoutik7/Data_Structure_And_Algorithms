package DSARelatedCodes;
import java.util.*;
public class MaxTip {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        long sum=0;
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i]-brr[i]);
            p[i] = new Pair(i,diff);
        }
        Arrays.sort(p, Comparator.comparingInt(Pair::getVal).reversed());
        for(int i=0;i<n;i++){
            if(arr[p[i].key] >= brr[p[i].key]){
                if(x>0){
                    sum+=arr[p[i].key];
                    x--;
                }
                else{
                    sum+=brr[p[i].key];
                    y--;
                }
            }
            else{
                if(y>0){
                    sum+=brr[p[i].key];
                    y--;
                }
                else{
                    sum+=arr[p[i].key];
                    x--;
                }
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int a[]={9,8,6,9,4,7};
        int b[]={5,2,9,6,8,2};
        long ans =maxTip(6,3,4,a,b);
        System.out.println(ans);
    }
}
class Pair{
    int key;
    int val;
    public Pair(int key,int val){
        this.key=key;
        this.val=val;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

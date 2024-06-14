package DSARelatedCodes;

public class CountNumbersContaining4 {
    public static int countNumbersWith4(int n) {
        int cnt=0;
        for (int i = 1; i <=n; i++) {
            if(rec(i)){
                cnt++;
            }
        }
        return cnt;

    }
    public static boolean if4Exist(int n){
        while(n!=0){
            if(n%10 == 4){
                return true;
            }
            n/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(countNumbersWith4(44));
    }
    public static boolean rec(int n){
        if(n%10==4){
            return true;
        }
        if(n==0){
            return false;
        }
        return rec(n/10);
    }
}

package DSARelatedCodes;

public class ArmstrongNum {
    static String armstrongNumber(int n){
        int temp=n;
        int digit=countDigit(n);
        int sum=0;
        while(n!=0){
            sum+=powerNum(n%10,digit);
            n/=10;
        }
        if(sum==temp){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public static int powerNum(int n, int m){
        int mul=1;
        while(m!=0){
            mul*=n;
            m--;
        }
        return mul;
    }
    public static int countDigit(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
}

package DSARelatedCodes;

public class Padovan{
    public static int padovanNum(int n){
        if(n==0 || n==1 || n==2){
            return 1;
        }
        
        return padovanNum(n-2)+padovanNum(n-3);
    }

    public static void main(String[] args) {
        System.out.println(padovanNum(6));

    }
}

package DSARelatedCodes;
import java.util.*;
public class ExtractNumberFromSentence {
    void ExtractNumber(String sentence) {

        String[] str = sentence.split("\\s+");
        int[] arr = new int[str.length];
        int j=0;
        for(int i=0;i<str.length;i++){
            if(Character.isDigit(str[i].charAt(0))){
                arr[j]=Integer.parseInt(str[i]);
                j++;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i : arr){
            if(!numContains9(i) && i>max){
                max=i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);


    }
    boolean numContains9(int n){
        while(n!=0){
            if(n%10==9){
                return true;
            }
            n=n/10;
        }
        return false;
    }
    public static void main(String[] args) {
        ExtractNumberFromSentence obj = new ExtractNumberFromSentence();
        obj.ExtractNumber("hello 923 hi 234 soutik");
    }
}

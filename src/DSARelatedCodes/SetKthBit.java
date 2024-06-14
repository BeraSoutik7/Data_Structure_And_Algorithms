package DSARelatedCodes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class SetKthBit {
    public static int setBit(int n,int k){
        ArrayList<Integer> arr = new ArrayList<>();

        while(n>0){
            arr.add(n%2);
            n/=2;
        }
        Collections.reverse(arr);
        arr.set(k-1,1);
        int decimal=0;
        int power=0;
        Collections.reverse(arr);
        for (int i : arr) {

            decimal += i * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(setBit(10,2));
    }
}

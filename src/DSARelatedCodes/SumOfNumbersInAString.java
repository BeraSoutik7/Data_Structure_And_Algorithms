package DSARelatedCodes;

import java.util.*;

public class SumOfNumbersInAString {
    public static long findSum(String str)
    {   str=str.toLowerCase();

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                s.append(str.substring(i,i+1));
            }
            else{
               s.append(",");
            }
        }
        String ss = s.toString();
        String a[] = ss.split(",");

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty()) {
                sum += Long.parseLong(a[i]);  // Use Long.parseLong to handle larger numbers
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(findSum("1abc23"));
    }
}

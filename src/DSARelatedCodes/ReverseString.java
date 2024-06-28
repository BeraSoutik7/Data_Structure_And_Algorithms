package DSARelatedCodes;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseString {
    public static void reverseString1(String s){
        String t = "";
        for (int i = s.length()-1; i >= 0; i--) {
            t=t+s.charAt(i)+"";
        }
        System.out.println("Reversed String :"+t);
    }
    public static void reverseString2(String s){
        String t= "";
        for (int i = 0; i < s.length(); i++) {
            t=s.charAt(i)+t;
        }
        System.out.println("Reversed String :"+t);
    }
    public static void reverseString3(String s){
        StringBuilder str = new StringBuilder(s);
        System.out.println("Reversed String :"+str.reverse());
    }
    public static void reverseString4(String s){
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = s.length()-1; i >= 0 ; i--) {
            arr.add(s.charAt(i));
        }
        String str = "";
        for (char c: arr) {
            str+=c;
        }
        System.out.println("Reversed String :"+str);
    }
    public static void reverseString5(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        String str = "";
        while(!st.isEmpty()){
            str+=st.peek();
            st.pop();
        }
        System.out.println("Reversed String :"+str);
    }
    public static void main(String[] args) {
        String s = "Hello";
        reverseString1(s);
        reverseString2(s);
        reverseString3(s);
        reverseString4(s);
        reverseString5(s);
    }
}

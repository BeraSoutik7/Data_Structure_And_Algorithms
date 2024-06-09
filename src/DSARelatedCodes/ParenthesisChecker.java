package DSARelatedCodes;

import java.util.Stack;

public class ParenthesisChecker {
    public static boolean parenthesisChk(String s){
        String str[] = s.split("");
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if (st.peek()=='(' && s.charAt(i)==')' ||
                        st.peek()=='{' && s.charAt(i)=='}' ||
                        st.peek()=='[' && s.charAt(i)==']'
                ){
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(st.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "[(]))";
        System.out.println(parenthesisChk(s));
    }
}

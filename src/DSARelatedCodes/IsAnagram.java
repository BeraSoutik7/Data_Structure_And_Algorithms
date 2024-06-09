package DSARelatedCodes;

import java.util.HashMap;

public class IsAnagram {
    public static boolean isAnagram(String a,String b)
    {

        // Your code here
        int ch[] = new int[26];
        if(a.length()!=b.length())
        {
            return false;
        }
        for(int i=0;i<a.length();i++){
            ch[a.charAt(i)-'a']++;

        }
        for(int i=0;i<b.length();i++){
            if(ch[b.charAt(i)-'a']>0){
                ch[b.charAt(i)-'a']--;
            }
        }
        for(int i: ch){
            if(i>0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram2(String a, String b){//not completed
        HashMap<Character,Integer> mp = new HashMap<>();
        if(a.length()!=b.length())
        {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            mp.put(a.charAt(i),mp.getOrDefault(a.charAt(i),0)+1);
        }
        for (int i = 0; i < b.length(); i++) {
            mp.put(a.charAt(i),mp.getOrDefault(a.charAt(i),0)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String a ="aabc";
        String b ="abba";
        System.out.println(isAnagram(a,b));
    }
}

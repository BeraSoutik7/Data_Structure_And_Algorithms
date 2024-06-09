package DSARelatedCodes;

public class Anagram {
    public static boolean isAnagram(String s,String t){

        int []ch = new int[26];
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            ch[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            count+=Math.abs(ch[i]);
        }
        return count==0;
    }
    public static void main(String[] args) {
        String s ="ac";
        String t ="bca";
        System.out.println(isAnagram(s,t));
    }
}

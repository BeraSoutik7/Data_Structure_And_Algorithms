package DSARelatedCodes;

public class LargestWordString {
    public static void largestWord(String s){
        String[] str = s.split(" ");
        String ans="";
        int max=0;
        for(String i : str){
            if(max<i.length()){
                max=i.length();
                ans=i;
            }
        }
        System.out.println("Largest word : "+ans);

    }
    public static void wordLargerThan8(String s){
        String[] str = s.split(" ");
        String ans ="";

        for(String i : str){
            if(i.length()>=8){
                ans = ans + i + " ";
            }
        }
        System.out.println("Result: "+ans);
    }

    public static void main(String[] args) {
        String s = "JISabcab College of Engineering institution";
        largestWord(s);
        wordLargerThan8(s);
    }
}

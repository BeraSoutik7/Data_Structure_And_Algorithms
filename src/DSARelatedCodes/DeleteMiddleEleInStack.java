package DSARelatedCodes;

import java.util.Stack;

public class DeleteMiddleEleInStack {
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        Stack<Integer> temp = new Stack<>();
        int i=0;
        while(i!=sizeOfStack/2+1){
            if(i!=sizeOfStack) {
                temp.add(s.peek());
            }
            s.pop();
            i++;
        }
        System.out.println(temp);
        System.out.println(s);
        temp.pop();
        while(!temp.isEmpty()){
            s.add(temp.peek());
            temp.pop();
        }
        System.out.println(s.toString());

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        //s.add(50);
        deleteMid(s,s.size());
    }
}

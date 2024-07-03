package DSARelatedCodes;

public class MergeTwoSortedLinkedList {
    public static Node mergeSortedLL(Node a, Node b){
        Node ans=null;
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        while(num1!=-1 && num2!=-1){
             num1 = minLL(a);
             num2 = minLL(b);
             if(num1>num2){
                 if(ans==null){
                     ans = new Node(num2);
                 }
                 else{
                     Node newNode =  new Node(num2);
                     Node temp=ans;
                     while(temp.next!=null){
                         temp=temp.next;
                     }
                     temp.next=newNode;
                 }
             }
             else{

             }
        }

    }
    public static int minLL(Node a){
        if(a==null){
            return -1;
        }
         Node temp = a;
         int min = Integer.MAX_VALUE;
         while(temp!=null){
             if(min>temp.data){
                 min=temp.data;
             }
             temp=temp.next;
         }
         temp=a;
         while(temp.next.data!=min){
             temp=temp.next;
         }
         temp.next=temp.next.next;
         return min;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node (5);
    }
}

package DSARelatedCodes;

import LinkedList.SinglyLinkedList.*;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumLinkedList extends SinglyLinkedList {
    public static int numDigit(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c;
    }
    public static Node createLL(ArrayList<Integer> arr){
        Node head = new Node(arr.get(0));
        Node prev= head;
        for (int i = 1; i < arr.size(); i++) {
            Node newNode = new Node(arr.get(i));
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }
    static void addTwoLists(Node num1, Node num2) {
        // code here
        // return head of sum list
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp1;
        Node temp2;
        int carry=0;
        temp1=reverseSinglyLL(num1);
        temp2=reverseSinglyLL(num2);
        while(temp1!=null || temp2!=null){
            if(temp1==null){
                int hold=temp2.data+carry;
                carry=0;
                if(numDigit(hold)>1){
                    carry = hold/10;
                    arr.add(hold%10);
                }
                else{
                    arr.add(hold);
                }
                temp2=temp2.next;
            }
            else if(temp2==null){
                int hold=temp1.data+carry;
                carry=0;
                if(numDigit(hold)>1){
                    carry = hold/10;
                    arr.add(hold%10);
                }
                else{
                    arr.add(hold);
                }
                temp1=temp1.next;
            }
            else{
                int hold=  temp1.data+temp2.data + carry;
                carry=0;
                if(numDigit(hold)>1){
                    carry = hold/10;
                    arr.add(hold%10);
                }
                else{
                    arr.add(hold);
                }
                temp1=temp1.next;
                temp2=temp2.next;

            }
        }
        if(carry>0){
            arr.add(carry);
        }
        for (int i = arr.size()-1; i >=0 ; i--) {
            if(arr.get(i)==0){
                arr.remove(i);
            }
            else{
                break;
            }
        }
//        if(arr.size()==0){
//            Node t = new Node(0);
//            return t;
//        }
        Collections.reverse(arr);
        System.out.println(arr);
        traversalOfSLL(createLL(arr));



    }

    public static void main(String[] args) {
        Node head =  new Node(0);
        Node a = new Node(0);
        Node head1 = new Node(0);
        Node b = new Node(0);
        Node c = new Node(0);

        head.next   = a;
        head1.next  = b;
        b.next      = c;

        traversalOfSLL(head);
        traversalOfSLL(head1);
        addTwoLists(head,head1);
        //Node ans = addTwoLists(head,head1);
        //traversalOfSLL(ans);
    }
    public static void traversalOfSLL(Node head){
        Node temp = head;
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverseSinglyLL(Node head){
        if(head==null){
            System.out.println("Not Possible");
        }
        else {
            Node temp=head;
            Node prev=null;
            Node next=null;
            while(temp!=null){
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            head=prev;
        }
        return head;
    }
}


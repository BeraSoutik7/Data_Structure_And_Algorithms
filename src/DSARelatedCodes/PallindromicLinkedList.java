package DSARelatedCodes;
import LinkedList.SinglyLinkedList.SinglyLinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class PallindromicLinkedList extends SinglyLinkedList {
    boolean isPalindrome(Node head)
    {
        //Your code here
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare the first half and the reversed second half
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
    public static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public static void main(String[] args) {

    }
}

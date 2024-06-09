package LinkedList.DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
public class DoublyLinkedList {
    static Node head=null;
    static int size = 0;
    public static void traversalOfDLL(){
        Node temp = head;
        if(head==null){
            System.out.println("Doubly linkedList is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void pushEnd(int data){
        Node newNode = new Node(data);

        if (head==null){
            head=newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
        size++;
    }
    public static void pushBeg(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
        size++;
    }
    public static void pushAtBegIndex(int index,int data){
        if(size-1<index || index<0){
            System.out.println("Not possible");
        }
        else {
            Node newNode = new Node(data);

            int i = 0;
            Node temp = head;
            if (index == 0) {
                pushBeg(data);
                return;
            } else {
                while (i != index - 1) {

                    temp = temp.next;
                    i++;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
            }
            size++;
        }

    }
    public static void pushAtEndIndex(int index, int data){
        if(size-1<index || index<0){
            System.out.println("Not possible");
        }
        else {
            Node newNode = new Node(data);
            if(size == 0){
                pushEnd(data);
                return;
            }
            int i = 0;
            Node temp = head;
            while (i != index) {

                    temp = temp.next;
                    i++;
                }
                temp.next.prev=newNode;
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
                size++;
            }


    }
    public static void deleteAtEnd(){
        if (head == null){
            System.out.println("Doubly linkedList is Empty...");
        }
        else{
            if(head.next == null){
                head = null;
                return;
            }
            Node temp= head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
            size--;
        }
    }
    public static void deleteAtBeg(){
        if (head == null){
            System.out.println("Doubly linkedList is Empty...");
        }
        else{
            if(head.next == null){
                head = null;
                return;
            }
            head.next.prev=null;
            head=head.next;
            size--;
        }
    }
    public static boolean deleteByIndex(int index){
        if(head==null || index > size-1 || index<0){
            System.out.println("Underflow or Not possible : size"+size);

        }
        else {
            if (index == 0) {
                deleteAtBeg();
            }
            else {
                int i=0;
                Node temp = head;
                while(i!=index){
                    temp=temp.next;
                    i++;
                }
                temp.prev.next=temp.next;
                if(temp.next != null){
                    temp.next.prev=temp.prev;
                }
                size--;

            }
            return true;
        }
        return false;
    }
    public static boolean deleteByValue(int data){
        if(head==null || !checkDataExist(data)){
            System.out.println("Doubly linkedList is empty");
        }
        else {

            Node temp = head;
            while(temp.data!=data){
                temp=temp.next;
            }
            if(temp.prev==null){
                deleteAtBeg();
                return true;
            }
            temp.prev.next = temp.next;

            if(temp.next != null){
                temp.next.prev=temp.prev;
            }
            size--;
            return true;
        }
        return false;
    }
    public static boolean checkDataExist(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void reverseDoublyLL(){
        if(head==null){
            System.out.println("Not Possible");
        }
        else{
            Node temp=head;
            Node next=null;
            Node hold=null;
            while(temp!=null){
                hold=temp;
                next=temp.next;
                temp.next=temp.prev;
                temp.prev=next;
                temp=next;
            }
            head=hold;
        }
    }
    public static boolean checkDataExistRec(Node head,int data){
        if(head == null){
            return false;
        }
        else if(head.data != data){
            return checkDataExistRec(head.next,data);
        }
        else {
            return true;
        }
    }















}

package LinkedList.SinglyLinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class SinglyLinkedList {
    static Node head;
    static int size=0;
    // Traverse through linked list
    public static void traversalOfSLL(){
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
    //push at the end of the linked list //TC:0(N)
    public static void pushEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else {
            Node temp = head;
            while(temp.next!=null){
               temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;

    }
    //Insert a node at the beginning TC:0(1)
    public static void pushBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    //insert at beginning of a specific node
    public static void  pushAtBegIndex(int index, int data){
        if(size-1<index || index<0){
            System.out.println("Not possible");
        }
        else {
            Node newNode =  new Node(data);
            if(index==0){
                pushBeg(data);
                return;
            }
            int i=0;
            Node temp = head;
            while(i!=index-1){
                temp=temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next=newNode;
        }
        size++;
    }
    public static void pushAtEndIndex(int index, int data){
        if(size-1<index || index<0){
            System.out.println("Not possible");
        }
        else {
            Node newNode = new Node(data);
            int i=0;
            Node temp = head;
            while(i!=index){
                temp=temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }
    public static void deleteAtEnd(){
        if(head==null){
            System.out.println("Underflow or Not Possible");
        }
        else {
            Node temp = head;
            if (size == 1){
                head=null;
                size--;
                return;
            }
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next = null;
        }
        size--;
    }
    public static void deleteAtBeg(){
        if(head == null){
            System.out.println("Underflow or Not Possible");
        }
        head=head.next;
        size--;
    }
    public static void deleteByIndex(int index){
        if(head==null && index > size-1 || index<0){
            System.out.println("Underflow or Not possible");
        }
        else {
            if(index==0){
                deleteAtBeg();
                return;
            }
            int i=0;
            Node temp = head;
            while(i!=index-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            size--;
        }

    }
    public static void deleteByValue(int data){
        if(head==null || !checkDataExist(data)){
            System.out.println("Underflow");
        }
        else{
            Node temp = head;
            if(size==1){
                deleteAtEnd();
                return;
            }
            if (head.data==data){
                deleteAtBeg();
                return;
            }
            while (temp.next.data!=data){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
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
}

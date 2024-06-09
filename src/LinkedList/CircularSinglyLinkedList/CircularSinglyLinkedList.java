package LinkedList.CircularSinglyLinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class CircularSinglyLinkedList {
    public static Node head = null;
    public static int size=0;

    public static void traversalOfCSLL(){
        if(head == null){
            System.out.println("Circular Singly LinkedList is empty..");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while (temp!=head);
        System.out.println();
    }
    public static void pushEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head=newNode;
            head.next=head;
        }
        else {
            Node temp = head;
            do{
                temp=temp.next;
            }
            while (temp.next!=head);
            temp.next=newNode;
            newNode.next=head;
        }
        size++;
    }
    public static void pushBeg(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            do{
                temp=temp.next;
            }
            while (temp.next!=head);
            newNode.next=head;
            temp.next=newNode;
            head=newNode;

        }
        size++;
    }
    public static void pushAtBegIndex(int index, int data){
        if(size-1<index || index<0){
            System.out.println("Not possible");
        }
        else{
            Node newNode = new Node(data);
            int i=0;
            if(index==0){
                pushBeg(data);
            }
            else{
                Node temp=head;
                while(i!=index-1){
                    temp=temp.next;
                    i++;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                size++;
            }
        }

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
            size++;
        }
    }
    public static boolean deleteByIndex(int index){
        return true;
    }
    public static void deleteAtEnd(){

    }
    public static void deleteAtBeg(){

    }
    public static boolean deleteByValue(int data){
        return true;
    }
    public static void reverseCircularLL(){

    }
    public static boolean checkDataExistRec(Node head,int data){
        return true;
    }
}

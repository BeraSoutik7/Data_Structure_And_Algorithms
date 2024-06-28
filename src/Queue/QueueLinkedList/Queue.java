package Queue.QueueLinkedList;
class QNode{
    int data;
    QNode next;
    QNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class Queue {
    static QNode rear;
    static QNode front;
    static int  totalSize = 0;
    static int currSize = 0;
    public  static void sizeInitializer(int size){
        if(totalSize>0){
            System.out.println("Can not initialize size");
            return ;
        }
       totalSize=size;
    }

    public static void enqueue(int data){
        if(currSize==totalSize){
            System.out.println("Queue is full");
            return ;
        }
        QNode newNode = new QNode(data);
        if(rear==null){
            rear=newNode;
            front=newNode;
            System.out.println("Enqueue Successful....");
            currSize++;
            return;
        }
        rear.next=newNode;
        rear=newNode;
        System.out.println("Enqueue Successful....");
        currSize++;
    }
    public static int dequeue(){

        if(rear==null){
            System.out.println("Dequeue not possible");
            return -1;
        }
        if(front==rear){
            int temp = front.data;
            front=null;
            rear=null;
            currSize--;
            return temp;
        }
        int temp = front.data;
        front=front .next;
        currSize--;

        return temp;

    }
    public static void getFront(){
        if(rear==null){
            System.out.println("Queue empty...");
            return;
        }
        System.out.println(front.data);
    }
    public static void getRear(){
        if(rear==null){
            System.out.println("Queue empty...");
            return;
        }
        System.out.println(rear.data);
    }
    public static boolean isEmpty(){
        return rear==null;
    }
    public static int getSize(){
        return currSize;
    }
}

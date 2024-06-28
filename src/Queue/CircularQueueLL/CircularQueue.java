package Queue.CircularQueueLL;
class CircularQNode{
    int data;
    CircularQNode next ;
    CircularQNode(int data){
        this.data=data;
    }
}
public class CircularQueue {
    private static CircularQNode front = null;
    private static CircularQNode rear = null;
    private static int size =0;
    private static int currentSize =0;
    public static void setSize(int data){
       size=data;
    }
    public static void getFront(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front : "+front.data);
    }
    public static void getRear(){
        if(rear == null){
            System.out.println("Queue is empty");
            return ;
        }
        System.out.println("Rear : "+rear.data);
    }
    public static void enQueue(int data){
        if(size==currentSize){
            System.out.println("Queue is full");
        }
        else{
            CircularQNode newNode = new CircularQNode(data);
            if(rear==null ){
                rear=newNode;
                front=newNode;
                front.next=rear;
            }
            else{
                rear.next=newNode;
                rear=newNode;
            }
            rear.next=front;
            currentSize++;
        }
    }
    public static void deQueue(){
        if(rear== null || front == null){
            System.out.println("Queue is empty");
            return ;
        }
        if(rear==front){
            System.out.println(rear.data);
            rear = null;
            front = null;
            currentSize--;
            return;
        }
        System.out.println(front.data);
        front=front.next;
        rear.next=front;
        currentSize--;

    }
    public static void isEmpty(){
        System.out.println(rear==null);
    }
    public static void getSize(){
        System.out.println(currentSize);
    }
    public static void printQueue(){
        if(rear==null){
            System.out.println("Queue is empty");
            return;
        }
        CircularQNode temp= front;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }
        while (temp!=front);
    }

}

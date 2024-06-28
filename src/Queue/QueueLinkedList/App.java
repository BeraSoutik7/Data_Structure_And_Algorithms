package Queue.QueueLinkedList;

import java.util.Scanner;

public class App extends Queue{
    public static void main(String[] args) {
        System.out.println("Queue Implementation with LinkedList");
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch!=99){
            System.out.println("Press 0: Initialize size of queue");
            System.out.println("Press 1: To get Front");
            System.out.println("Press 2: To get Rear");
            System.out.println("Press 3: Enqueue");
            System.out.println("Press 4: Dequeue");
            System.out.println("Press 5: isEmpty");
            System.out.println("Press 6: getSize");
            ch = sc.nextInt();
            switch (ch){
                case 0 -> sizeInitializer(sc.nextInt());
                case 1 -> getFront();
                case 2 -> getRear();
                case 3 -> enqueue(sc.nextInt());
                case 4 -> dequeue();
                case 5 -> System.out.println(isEmpty());
                case 6 -> System.out.println(getSize());


            }

        }
    }
}

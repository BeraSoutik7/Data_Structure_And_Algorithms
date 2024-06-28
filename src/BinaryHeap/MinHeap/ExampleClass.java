package BinaryHeap.MinHeap;

import java.util.Arrays;
import java.util.Scanner;

import static BinaryHeap.MinHeap.MinHeap.*;

public class ExampleClass {
    public static void main(String[] args) {
//        MinHeap mh ;
//        mh.insert(10);
//        mh.insert(20);
//        mh.insert(15);
//        mh.insert(40);
//        mh.insert(50);
//        mh.insert(100);
//        mh.insert(25);
//        mh.insert(45);
//        mh.insert(12);
//        mh.insert(9);
//        System.out.println(Arrays.toString(mh.arr));

//        int[] minHeap={20, 8, 22, 4, 12, 10,  14};
//
//        //minHeap(minHeap);
//        maxHeap(minHeap);
//        System.out.println(Arrays.toString(minHeap));

        Scanner sc = new Scanner(System.in);
        int ch = 0;
        System.out.println("Press 1: Set Capacity---------->");
        System.out.println("Press 2: insert data in heap--->");
        System.out.println("Press 3: Print heap------------>");
        System.out.println("Press 4: For min heap---------->");
        System.out.println("Press 5: Change heap (checking heapify)");
        System.out.println("Pres 99: Exit------------------>");

        while(ch!=99) {
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> setCapacity(sc.nextInt());
                case 2 -> insert(sc.nextInt());
                case 3 -> printHeap();
                case 4 -> minHeap();
                case 5 -> changeHeap(sc.nextInt(),sc.nextInt());
                case 6 -> System.out.println(getMin());
                case 7 -> System.out.println(extractMin());
                case 8 -> decreaseKey(sc.nextInt(), sc.nextInt());
                case 9 -> deleteKey(sc.nextInt());
                case 10-> heapSort();
            }
        }


    }

}

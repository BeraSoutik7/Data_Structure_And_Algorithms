package BinaryHeap.MinHeap;

import java.util.Arrays;

import static BinaryHeap.MinHeap.MinHeap.*;

public class ExampleClass {
    public static void main(String[] args) {
        MinHeap mh = new MinHeap(15);
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

        int[] minHeap={20, 8, 22, 4, 12, 10, 14};

        minHeap(minHeap);
        //maxHeapifyRec(minHeap,0);
        System.out.println(Arrays.toString(minHeap));



    }

}

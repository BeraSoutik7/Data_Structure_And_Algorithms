package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class Example1 extends DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        System.out.println("Press 0: for print the Doubly Linked List\nPress 1: for insert at end\nPress 2: for " +
                "insert at beginning\nPress 3: Insert at beginning of a index \nPress 4: Insert at end of a " +
                "index\nPress 5: for delete at end\nPress 6: for delete from beginning\nPress 7: for delete by " +
                "index\nPress 8: for delete by value\nPress 9: for reverse linked list\nPress 10: Search a given " +
                "data\nPress 99: to exit");
        while (ch != 99) {
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 0 -> {
                    System.out.println("Doubly Linked list");
                    traversalOfDLL();
                }
                case 1 -> {
                    System.out.println("Enter data to push");
                    pushEnd(sc.nextInt());
                    System.out.println("Data insertion successful");
                }
                case 2 -> {
                    System.out.println("Enter data to push");
                    pushBeg(sc.nextInt());
                    System.out.println("Data insertion successful");
                }
                case 3 -> {
                    System.out.println("Enter index for push at beginning");
                    int index = sc.nextInt();
                    System.out.println("enter data to push");
                    pushAtBegIndex(index, sc.nextInt());
                    System.out.println("Data insertion successful");
                }
                case 4 -> {
                    System.out.println("Enter index for push at end");
                    int index = sc.nextInt();
                    System.out.println("Enter data to push");
                    pushAtEndIndex(index, sc.nextInt());
                    System.out.println("Data insertion successful");
                }
                case 5 -> deleteAtEnd();
                case 6 -> deleteAtBeg();
                case 7 -> {
                    System.out.println("Enter index to be deleted");
                    if (deleteByIndex(sc.nextInt())) {
                        System.out.println("Data deletion successful");
                    } else {
                        System.out.println("Data deletion unsuccessful");
                    }
                }
                case 8 -> {
                    System.out.println("Enter value to be deleted");
                    if (deleteByValue(sc.nextInt())) {
                        System.out.println("Data deletion successful");
                    } else {
                        System.out.println("Data deletion unsuccessful");
                    }
                }
                case 9 -> reverseDoublyLL();
                case 10 -> {
                    System.out.println("Enter a data to search");
                    System.out.println(checkDataExistRec(head, sc.nextInt()));
                }

            }
        }
    }
}

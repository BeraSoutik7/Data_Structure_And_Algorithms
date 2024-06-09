package Tree.BinarySearchTree;

public class Example1 {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        bt.insert(8);
        bt.insert(7);
        bt.insert(12);
        bt.insert(15);
        bt.insert(2);
        bt.insert(5);

        System.out.println("Inorder ------>");
        bt.inorder();
        System.out.println();
        System.out.println("Preorder------>");
        bt.preorder();
        System.out.println();
        System.out.println("Postorder----->");
        bt.postorder();
        System.out.println();
        System.out.println(bt.minElement());



    }
}

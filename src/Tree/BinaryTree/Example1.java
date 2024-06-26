package Tree.BinaryTree;



public class Example1 {
    public static void main(String[] args){
        //8,7,12,15,2,5
        BinaryTree bt = new BinaryTree();

        Node root = new Node(8);
        root.left = new Node(7);
        root.right = new Node(12);
        root.left.left = new Node(15);
        root.left.right = new Node(2);
        root.right.left = new Node(555);
//                8
//              7    12
//            15  2 555
        System.out.println("Inorder");
        bt.inorder(root);
        System.out.println("\nPreorder");
        bt.preorder(root);
        System.out.println("\nPostorder");
        bt.postorder(root);
        System.out.println();
        System.out.println(bt.countLeaf(root));
        System.out.println();
        //System.out.println(bt.minElement(root));
    }
}

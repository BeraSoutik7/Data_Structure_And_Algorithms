package Tree.BinarySearchTree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class BinarySearchTree {
    Node root;
    public void insert(int data){
        root = insertRec(data,root);
    }
    private Node insertRec(int data, Node root){
        if(root==null){
            root = new Node(data);
        }
        else if(data< root.data){
            root.left = insertRec(data,root.left);
        } else if (data>root.data) {
            root.right = insertRec(data, root.right);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }
    private void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    public void preorder(){
        preorderRec(root);
    }
    private void preorderRec(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    public void postorder(){
        postorderRec(root);
    }
    private void postorderRec(Node root){
        if(root!=null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}

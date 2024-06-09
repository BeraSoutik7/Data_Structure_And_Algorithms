package Tree.BinaryTree;
class Node {
         int data;

         Node left;
         Node right;
         public Node (int data) {
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
     public  class BinaryTree {
         public int countLeaf(Node root){
             if(root == null){
                 return 0;
             }
             if(root.left == null && root.right == null){
                 return 1;
             }
             return countLeaf(root.left)+countLeaf(root.right);
         }

         public void inorder(Node root){
             inorderRec(root);
         }
         private void inorderRec(Node root){
             if(root!=null){
                 inorderRec(root.left);
                 System.out.print(root.data+" ");
                 inorderRec(root.right);
             }
         }
         public void preorder(Node root){
             preorderRec(root);
         }
         private void preorderRec(Node root){
             if(root!=null){
                 System.out.print(root.data+" ");
                 preorderRec(root.left);
                 preorderRec(root.right);
             }
         }
         public void postorder(Node root){
             postorderRec(root);
         }
         private void postorderRec(Node root){
             if(root!=null) {
                 postorderRec(root.left);
                 postorderRec(root.right);
                 System.out.print(root.data + " ");
             }
         }
         public int minElement(Node root){

             return minElementRec(root);
         }
         private int minElementRec(Node root){
             if(root == null){
                 return -1;
             }
             if(root.left == null){
                 return root.data;
             }
             return minElement(root.left);
         }

     }



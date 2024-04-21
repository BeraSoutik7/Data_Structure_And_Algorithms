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

     }



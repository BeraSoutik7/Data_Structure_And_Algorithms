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
          static int idx = -1;
          public static Node buildTree(int nodes []){
              idx++;
             if (nodes[idx] == -1) {
                 return null;
             }
             Node newNode = new Node(nodes[idx]);
             newNode.left = buildTree(nodes);
             newNode.right = buildTree(nodes);

             return newNode;
         }
     }



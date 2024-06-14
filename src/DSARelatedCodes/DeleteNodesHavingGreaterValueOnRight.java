package DSARelatedCodes;

public class DeleteNodesHavingGreaterValueOnRight extends AddTwoNumLinkedList{
    public static Node  removeNode(Node head){

        Node head1=reverseSinglyLL(head);
        Node temp=head1;
        Node prev = head1;
        int max=-1;
        while(temp!=null){
            if(temp==head1){
                max=temp.data;
                prev=temp;
            }
            else{
                if(temp.data<max){
                    prev.next=temp.next;

                }
                else{
                    max=temp.data;
                    prev=temp;
                }
            }

            temp=temp.next;
        }

        return reverseSinglyLL(head1);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node a  = new Node(20);
        Node b = new Node(60);
        Node c = new Node(58);

        head.next=a;
        a.next=b;
        b.next=c;

        traversalOfSLL(head);
        Node ans = removeNode(head);
        traversalOfSLL(ans);
    }
}

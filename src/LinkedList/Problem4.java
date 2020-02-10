package LinkedList;

/**
 *
 * Given a Linked List, write a function that accepts the head node of the linked list as a parameter and returns the value of node present at (floor(sqrt(n)))th position in the Linked List, where n is the length of the linked list or the total number of nodes in the list.
 */
public class Problem4 {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String [] args){
        Node list = new Node(10);
        list.next = new Node(8);
        list.next.next = new Node( 5);
        list.next.next.next = new Node(6);
        list.next.next.next.next = new Node(2);

        Node ans=null, p =list;

        int i = 1,j = 1;

        while(p != null){
            if(i == j*j){
                if(ans == null)
                    ans = list;
                else
                    ans = ans.next;
                j++;
            }
            i++;
            p = p.next;
        }
        System.out.print(ans.data);
    }
}

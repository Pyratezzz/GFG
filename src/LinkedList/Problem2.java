package LinkedList;

/***
 *
 *Doubly Linked List from a Ternary Tree
 */
public class Problem2 {
    static class DLL{
        Node head;

        public void print(){
            if(head == null){
                return;
            }
            Node itr = head;
            while(itr != null){
                System.out.println(itr.data);
                itr = itr.right;
            }
        }

        //insert in front
        public void insert(Node root){
            if(root == null)
                return;
            if(head == null)
            {
                root.left  = root.mid = root.right = null;
                head = root;
                return;
            }

            root.right = head;
            head.left = root;
            root.left = root.mid = null;
            head = root;

        }

        public void convert(Node root){
            if(root == null)
                return;
            convert(root.right);

            convert(root.mid);

            convert(root.left);

            insert(root);
        }
    }

    static class Node{
        int data;
        Node left,mid,right;

        Node(int d){
            data = d;
            left = mid = right = null;
        }
    }
   static class TernaryTree{
        Node root;

    }

    public static void main(String[] args){
        TernaryTree tree = new TernaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.mid = new Node(3);
        tree.root.left.left = new Node(5);
        tree.root.left.mid = new Node(6);
        tree.root.left.right = new Node(7);
        tree.root.mid.left = new Node(8);
        tree.root.mid.mid = new Node(9);
        tree.root.mid.right = new Node(10);
        tree.root.right.left = new Node(11);
        tree.root.right.mid = new Node(12);
        tree.root.right.right = new Node(13);

        DLL list = new DLL();
        list.convert(tree.root);
        list.print();

    }

}

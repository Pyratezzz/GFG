package Queue;
/**
 *
 * Level Order Traversal
 */

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;


public class BFS {
    static class Node{
        int data;
        Node left, right;

        Node (int d){
            data = d;
            left = right = null;
        }
    }

    public static void print_bfs(Node root) {
        if(root == null)
            return;
        Queue<Node> queue = new ConcurrentLinkedQueue<>();
        queue.add(root);

        while(queue.size() != 0) {
            Node p = queue.poll();
            if(p.left != null)
                queue.add(p.left);
            if(p.right != null)
                queue.add(p.right);
            System.out.println(p.data);
        }
    }

    public static void main(String[] args){
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        print_bfs(root);
    }
}

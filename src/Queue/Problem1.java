package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * Reversing First k elements of Queue
 */
public class Problem1 {
    ;
    public static void reverse(Queue<Integer> q,int k){
        Stack<Integer> s= new Stack<>();
        if(k < 0 || k > q.size() )
            return;
        int i = k;
        while(i>0){
            s.push(q.peek());
            q.remove();
            i--;
        }

        while(!s.empty()){
            q.add(s.pop());
        }

        i=q.size()-k;

        while(i>0){
            q.add(q.poll());
            i--;
        }
        print(q);

    }
    public  static void print(Queue<Integer> q){

        if(q.isEmpty())
            return;
        while(!q.isEmpty())
            System.out.println(q.poll());


    }
    public static void main(String [] args){
        Queue<Integer>q  = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        reverse(q,6);













        }
    }



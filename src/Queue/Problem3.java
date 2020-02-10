package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * Smallest Number divisible by N contains only 0,9
 * OR
 * N binary number
 */
public class Problem3 {
    public static void main(String[] args){
        int n = 7;
        int size = Integer.MAX_VALUE;
        Queue <String> q =new LinkedList<String>();
        String t = "9";
        q.add(t);
        int itr =0;
        while(itr<size && Integer.valueOf(t)%n != 0){
            String temp = q.peek();
            q.remove();
            q.add(temp+'0');
            q.add(temp+'9');
            t = q.peek();
        }
        System.out.println(q.peek());
    }



}

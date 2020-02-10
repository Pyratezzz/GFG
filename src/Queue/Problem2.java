package Queue;

import java.util.Deque;
import java.util.LinkedList;


/**
 *
 * Find the max in contigueus subarray of size k
 */
public class Problem2 {
    public static void main(String[] args){
        int a[] = {1,2,3,1,4,5,2,3,6};
        Deque<Integer> q = new LinkedList<Integer>();
        int k = 3;
        q.add(a[0]);
        int i = 1;
        while(k>1){
            while(!q.isEmpty() && q.peekLast()<a[i])
                q.removeLast();
            q.addLast(a[i]);
            k--;
            i++;
        }

        while(i<a.length){
            System.out.println(q.peekFirst());
            while(!q.isEmpty() && q.peekLast()<a[i])
                q.removeLast();
            q.addLast(a[i]);
            i++;
        }
        System.out.println(q.peekFirst());
    }
}

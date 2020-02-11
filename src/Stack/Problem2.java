package Stack;

import java.util.Stack;


/**
 *
 * print next greater element(NGE)
 * print prev greater element
 */
public class Problem2 {
    public static void main(String [] args){
        int a[] = {6,3,4,5,2,7,12,19};
        int b[] = new int[a.length];
        int c[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        Stack<Integer> q = new Stack<>();
        for(int i =0;i<a.length;i++){


            if(s.empty() || a[s.peek()]>a[i]) {
                s.push(i);
            } else{
                while(!s.empty() && a[s.peek()]<a[i]){
                    b[s.pop()] =a[i];
                }
                s.push(i);
            }


            if(q.empty() || a[q.peek()]<a[i]){
                q.push(i);
                c[i] = -1;
            }
            else{
                c[i] = a[q.peek()];
            }
        }
        while(!s.empty()){
            b[s.pop()] = -1;
        }


        System.out.println("NGE: ");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("");
        System.out.println("PGE: ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}

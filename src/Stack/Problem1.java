package Stack;

import java.util.Stack;


/**
 *
 * Design a stack that supports getMin() in O(1) time and O(1) extra space
 */
public class Problem1 {
    static class Stack{
        private int min;
       private int top = -1;
       private int arr[] = new int[100];

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == 99;
        }
        public void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            if(isEmpty()){
                min = x;
                arr[top+1] = x;
                top = top + 1;
            }else{
                if(x < min){
                    arr[top+1] = 2*x - min;
                    min = x;
                    top = top+1;
                }else{
                    arr[top+1] = x;
                    top = top+1;
                }
            }
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack Empty");
                return 0;
            } else {
                return arr[top];
            }
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int temp = arr[top];
            top = top -1;
            if(temp<min){
                int t = min;
                min = 2*min - temp;
                return t;
            }
             return temp;
        }

        public int getMin(){
            return min;
        }
    }

    public static void main(String []args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(0);
        s.push(5);
        System.out.println(s.getMin());
        s.pop();
        s.pop();
        System.out.println(s.getMin());

    }
}

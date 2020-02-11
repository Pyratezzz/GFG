package Stack;

public class Stack {
    static int size =100;
    int top = -1;
    int a[] = new int[100];
    boolean isEmpty(){
        return this.top ==-1?true:false;
    }

    public void push(int x){
        if(top+1 == size){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            top = top+1;
            a[top] = x;
            return;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        } else {
            int temp = a[top];
            top = top-1;
            return temp;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        } else {
            return a[top];
        }
    }

    public static void main(String args[])
        {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.peek() + " Peek from stack");
            System.out.println(s.pop() + " Popped from stack");
        }
    }

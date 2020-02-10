package Queue;

public class Queue {

   private int rear, front,size,capacity;
   private int [] arr;

   public Queue(int cap){
       front = 0;
       size = 0;
       arr = new int[cap];
       capacity = cap;
       rear = capacity-1;
   }

  public  boolean isFull(){
       return size == capacity;
   }

   public boolean isEmpty(){
       return size == 0;
   }

   public int getFront(){
       if(isEmpty())
       {
           return Integer.MIN_VALUE;
       }
       return arr[front];
   }

   public int dequeue(){
       if(isEmpty())
       {
           return Integer.MIN_VALUE;
       }

       int ans = arr[front];
       front = (front+1)%capacity;
       size = size - 1;
       return ans;
   }

   public void enqueue(int ele){
       if(isFull())
           return;

       rear = (rear + 1)%capacity;
       arr[rear] = ele;
       size = size+1;
       return;
   }

   public void print(){
       if(isEmpty())
           return;

       int i = front;
       while(i != rear){
           System.out.println(arr[i]);
           i = (i+1)%capacity;
       }
       System.out.println(arr[i]);
   }

   public static void main(String [] args){
       Queue q = new Queue(10);
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);

       q.print();
       System.out.println(q.getFront());
       q.dequeue();
       q.print();
   }

}

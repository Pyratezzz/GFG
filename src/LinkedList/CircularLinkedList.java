package LinkedList;

public class CircularLinkedList {
    Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    public void push(int d){
        Node h = new Node(d);
        if(head == null){
           head = h;
           head.next = this.head;
        }
        else{
            Node t = head;
            while(t.next != head)
            {
                t = t.next;
            }
            t.next = h;
            h.next = head;
        }
    }

    public void print(){
        if(head == null)
            return;
        Node t = head;
        System.out.println(t.data);
        t=t.next;
        while( t != head){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public void splitList(){
        if(head == null)
            return;

        Node t = head;
        int count =1;

        while(t.next != head){
            t=t.next;
            count ++;
        }

        int i = count - (count/2);
        t = head;
        i--;
        while(i != 0){
            i--;
            t = t.next;
        }
        Node p = t.next;
        t.next = head;

        t = p;

        while(p.next != head){
          p=p.next;
        }
            p.next=t;

        CircularLinkedList h1 = new CircularLinkedList();
        CircularLinkedList h2 = new CircularLinkedList();
        h1.head=head;
        h2.head=t;
        System.out.println("First list");
        h1.print();
        System.out.println("Second list");
        h2.print();
    }

    public void delete(int d){
        Node p = head;
        Node q = head.next;
        while (q.data != d && q != head){
            p=q;
            q=q.next;
        }

        if(q.data ==d){
            p.next = q.next;
        }
        return;
    }

    public  void exchange(){
        if(head == null || head.next == head)
            return;

        Node p = head;
        Node q = head.next;
        while(q.next != head){
            p=q;
            q=p.next;
        }

        q.next = head.next;
        head.next =q;
        p.next =head;
        head = q;

    }
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Print Circular linked list");
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(6);
        list.push(4);
        list.push(5);
        list.print();


        System.out.println("Delete 6 from list");
        list.delete(6);
        list.print();

        System.out.println(("Exchanging First and Last Node"));
        list.exchange();
        list.print();

        System.out.println("Breaking the list into two, if odd first one have extra element");
        list.splitList();

    }
}

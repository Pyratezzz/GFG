package LinkedList;




public class LinkedList {

    Node head;

    static class  Node {
        int data;
        Node next;

        Node(int d){
            data =d;
            next=null;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next=b;
        b.next=c;
        list.head=a;

        Node t =list.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }


        //pushing new node in front
        Node d = new Node(0);
        d.next=list.head;
        list.head=d;

        System.out.println("pushing new node in front");
        t=list.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }


        System.out.println("pushing new node in last");

        Node e = new Node(5);
        if(list.head==null)
            list.head=e;
        else{
            t=list.head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=e;
        }
        t=list.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }

        System.out.println("pushing new node in middle, after 4th node");
        Node f = new Node(4);
        t=list.head;
        while(t!=null && t.data!=3){
            t=t.next;
        }
        f.next=t.next;
        t.next=f;

        t=list.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }

        System.out.println("Delete key 3");

        t=list.head;
        if(list.head.data==3){
            list.head=list.head.next;
            t.next=null;
        }

        Node prev =null;
        while(t!=null && t.data!=3){
            prev =t;
            t=t.next;
        }
        prev.next =t.next;
        t.next=null;


        t=list.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }
}

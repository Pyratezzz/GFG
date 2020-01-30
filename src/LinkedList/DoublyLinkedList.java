package LinkedList;

import java.util.HashMap;
import java.util.Map;


public class DoublyLinkedList {
    Node head;

    static class Node{
        int data;
        Node next,prev;

        Node(int d){
            data =d;
            next = prev = null;
        }
    }

    public void insert(int d){
        Node insertingNode = new Node(d);
        if(head == null){
            head = insertingNode;
        }
        else{
            Node itr = head;
            while(itr.next != null)
                itr = itr.next;
            itr.next = insertingNode;
            insertingNode.prev = itr;
        }
    }

    public void delete(int d){
        if(head == null)
            return;
        Node itr =head;

        while(itr != null && itr.data != d){
            itr = itr.next;
        }

        if(itr.data == d){
            if(itr.prev != null){
                itr.prev.next = itr.next;
            }
            else {
                head = itr.next;
            }
           if(itr.next != null){
               itr.next.prev = itr.prev;
           }
            itr.prev = itr.next = null;
        }
    }

    public void reverse(){
        if(head == null || head.next ==null)
            return;
        Node p = head;

        while(p != null){
            p.prev = p.next;
            p = p.next;
        }
        p = head;
        p.next = null;
        while(p.prev != null){
            p.prev.next = p;
            p =p.prev;
        }
            head = p;
    }

    public  void unique(){
        if(head == null){
            return;
        }
        Map<Integer,Integer> map = new HashMap<>();

        Node itr = head;

        while(itr != null){
            if(map.containsKey(itr.data)){
                delete(itr.data);
            }
            else{
                map.put(itr.data,itr.data);
            }

            itr = itr.next;
        }

    }

    public void print(){
        if(head == null){
            return;
        }
        Node itr = head;
        while(itr != null){
            System.out.println(itr.data);
            itr = itr.next;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        for(int i = 0;i < 8;i++){
            list.insert(i+1);
            list.insert(i);
        }

        System.out.println("Printing the list");
        list.print();

        System.out.println("removing duplicates");
        list.unique();
        list.print();

        System.out.println("Reverse the list");
        list.reverse();
        list.print();



        System.out.println("Delete 3");
        list.delete(3);
        list.print();

    }
}

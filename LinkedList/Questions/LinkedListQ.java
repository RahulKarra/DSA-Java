package LinkedList.Questions;

import LinkedList.LL;

public class LinkedListQ {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size+=1;
    }

    public void display(){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int value){

        if (tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void duplicates(){
        Node node = head;

        while (node.next != null){
            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else {
                node= node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    public static LinkedListQ merge(LinkedListQ first, LinkedListQ second) {

        Node fh = first.head;
        Node sh = second.head;

        LinkedListQ ans = new LinkedListQ();

        while (fh != null && sh != null){
            if (fh.value < sh.value){
                ans.insertLast(fh.value);
                fh = fh.next;
            }else {
                ans.insertLast(sh.value);
                sh = sh.next;
            }
        }

        while (fh != null){
            ans.insertLast(fh.value);
            fh = fh.next;
        }

        while (sh != null){
            ans.insertLast(sh.value);
            sh = sh.next;
        }
        return ans;
    }

    public static void main(String[] args) {
//        LinkedListQ l = new LinkedListQ();
//        l.insertLast(1);
//        l.insertLast(1);
//        l.insertLast(2);
//        l.insertLast(3);
//        l.insertLast(3);
//        l.insertLast(4);
//        l.display();
//        l.duplicates();
//        l.display();

        LinkedListQ first = new LinkedListQ();
        LinkedListQ second = new LinkedListQ();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);

        LinkedListQ ans = LinkedListQ.merge(first,second);
        ans.display();



    }





    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
    }

}

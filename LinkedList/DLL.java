package LinkedList;

public class DLL {

    private Node head;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + " -> " );
            node = node.next;
        }
        System.out.println("Null");
    }


    public void displayBothSides(){
        Node node = head;
        Node last = null;

        while (node != null){
            System.out.print(node.value + " -> " );
            last = node;
            node = node.next;
        }
        System.out.println("Null");

        while (last!= null){
            System.out.print(last.value + " -> ");
            last =  last.prev;
        }
        System.out.println("Start");
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        if (head == null){
            node.prev = null;
            head = node;
        }

        while (last.next != null){
            last = last.next;
        }
        node.next = null;
        node.prev =  last;
        last.next = node;

    }


    public Node find(int value){
        Node node = head;

        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insertAfter(int after, int value){

        Node givenNode = find(after);

        if (givenNode == null){
            System.out.println("Node doesn't Exist");
            return;
        }

        Node node = new Node(value);
        node.prev = givenNode;
        node.next = givenNode.next;
        if (node.next == null){
            node.next.prev = node;
        }
        givenNode.next = node;
        givenNode.next.prev = node;
    }


        private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

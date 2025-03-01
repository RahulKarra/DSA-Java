package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(8);
//        list.insertFirst(7);
//        list.insertFirst(9);
//
//        list.display();
//
//        list.insertAtRandom(6,2);
//
//        list.display();
//
////        System.out.println(list.deleteFirst());
//        list.deleteFirst();
//        list.display();
//
////        System.out.println(list.deleteLast());
//        list.deleteLast();
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(7);
//        list.insertFirst(9);
//        list.insertFirst(3);
//        list.insertFirst(1);
////        list.display();
//
//        list.insertLast(12);
//        list.display();
////        list.displayBothSides();
//
//        list.insertAfter(3,99);
//        list.display();

        CircularLL cll = new CircularLL();
        cll.insert(2);
        cll.insert(5);
        cll.insert(7);
        cll.insert(9);
        cll.insert(15);
        cll.display();
        cll.delete(9);
        cll.display();





    }
}

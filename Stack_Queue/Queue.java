package Stack_Queue;

public class Queue {

    private int[] arr;      //to store the elements of stack
    private int capacity;   // to keep a track of capacity

    private int front;      // Front pointer
    private int rear;       // rear pointer

    public Queue(int size) {
        front = 0;
        rear = 0;
        capacity = size;
        arr = new int[size];
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            arr[rear++] = item;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }

        int removed = arr[0];

        //shift elements
        for (int i = 1; i < rear; i++) {
            arr[i - 1] = arr[i];
        }
        rear--;
        return removed;
    }

    private boolean isFull() {
        return capacity == rear;
    }

    private boolean isEmpty() {
    return front == rear;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }else {

            for (int i = 0; i < rear ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public void displayFront(){
        if (isEmpty()){
            System.out.print("Queue is Empty");
        }
        else {
            System.out.print(arr[0]);
        }
    }




    public static void main(String[] args) throws Exception {

        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        System.out.println("Removed Element " + queue.dequeue());
        queue.display();
        queue.displayFront();



    }


}

package Stack_Queue;

public class Stack {

    private int[] arr;  //to store the elements of stack
    private int capacity;       // to keep a track of capacity
    private int top;        //Top pointer to the stack

    public Stack(int size) {
        arr =  new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int n){
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = n;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
        }
        return arr[top--];
    }

    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.pop();
        stack.display();
    }
}

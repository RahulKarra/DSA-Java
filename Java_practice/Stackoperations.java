package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Stackoperations
{
    public static void main(String[] args) {

        Stack st=new Stack(5);
        Scanner in=new Scanner(System.in);
        System.out.println("1.Push\n2.pop\n3.display");
        int ch=in.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter the elements into stack");
                st.push(in.nextInt());
            case 2:
                System.out.println("Elements deletion");
                st.pop(1);
            case 3:
                st.display();
        }

    }
}

class Stack {
        private int arr[];
        private int top;
        private int capacity;

        Stack(int size)
        {
            arr=new int[size];
            capacity=size;
            top=-1;
        }

        public void push(int ele)
        {
            if(top == capacity-1)
            {
                System.out.println("Stack overflow");
                System.exit(-1);
            }
            System.out.println("Inserting:"+ele);
            for (int i = 0; i <arr.length ; i++) {
                arr[++top]=ele;
            }
        }

        public void pop(int ele)
        {
        if (top==-1)
        {
            System.out.println("Stack underflow");
            System.exit(-1);
        }
            System.out.println("Deleting :"+ele);
            for (int i = 0; i < arr.length; i++) {
                arr[top--]=ele;
            }
        }

        public void display()
        {
            if(top==-1)
            {
                System.out.println("no elements");
            }
            System.out.println(arr[top]);
        }

        public int size()
        {
            return top+1;
        }
        }



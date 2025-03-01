package Trees;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //Insert elements.
    public void populate(Scanner in){
        System.out.println("Enter the root Node: ");
        int value = in.nextInt();
        root = new Node(value);
        populate(in, root);
    }

    private void populate(Scanner in, Node node){
        System.out.println("Do you want to Enter left side of " + node.value +"?");
        boolean left = in.nextBoolean();

        if(left){
            System.out.println("Enter the value of the Left of" + node.value);
            int value = in.nextInt();
            node.left = new Node(value);
            populate(in,node.left);
        }

        System.out.println("Do you want to Enter right side of " + node.value +"?");
        boolean right = in.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of" + node.value);
            int value = in.nextInt();
            node.right = new Node(value);
            populate(in,node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if (node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
        tree.display();
    }

}

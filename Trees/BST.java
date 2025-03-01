package Trees;

public class BST {

    public class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public BST() {
    }

    private Node root;

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }

        if (value < node.value){
            node.left = insert(value, node.left);
        }
        if (value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private int height(Node node) {
        if (node== null){
            return -1;
        }
        return node.height;
    }

}

package Trees;

public class BinarySearchTree {

    public BinarySearchTree() {
    }

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

    private Node root;

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + ":");
        display(node.right, "Right child of " + node.getValue() + ":");
    }

    public void insert(int value){
        root =  insert(value, root);
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

    public void populate(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            insert(nums[i]);
        }
    }

    public void sortedPopulate(int[] nums){
        sortedPopulate(nums,0, nums.length);
    }

    private void sortedPopulate(int[] nums, int start, int end){

        if (start >= end){
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        sortedPopulate(nums,start, mid);
        sortedPopulate(nums,mid+1, end);

    }

    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left) -  height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(15);
//        tree.insert(10);
//        tree.insert(5);
//        tree.insert(8);
//        tree.insert(20);
//        tree.insert(12);
//        tree.display();
//        System.out.println(tree.balanced(tree.root));

        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.height(tree.root));
        System.out.println(tree.balanced(tree.root));




    }

}

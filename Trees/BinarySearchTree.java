package Trees;

public class BinarySearchTree {
    class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val = val;
        }
    }

    BinarySearchTree(){

    }

    Node root;

    int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    boolean isEmpty(){
        return root == null;
    }

    Node insert(int value){
        return insert(value, root);
    }

    Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.val){
            node.left = insert(value, node.left);
        }
        if(value > node.val){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    boolean balanced() {
        return balanced(root);
    }

    boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    void display() {
        display(this.root, "Root Node: ");
    }

    void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }
}

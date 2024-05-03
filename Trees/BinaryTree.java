package Trees;

import java.util.Scanner;

public class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right;

        Node (int val){
            this.val = val;
        }
    }

    BinaryTree(){

    }

    Node root;

    void populate(Scanner input){
        System.out.print("Enter the value of Root: ");
        int val = input.nextInt();
        root = new Node(val);
        populate(input, root);
    }

    void populate(Scanner input, Node node){
        System.out.print("Do you want to add the left Node of " + node.val + " ");
        boolean left = input.nextBoolean();
        if(left){
            System.out.println("Enter the value of left Node of " + node.val + " ");
            int val = input.nextInt();
            node.left = new Node(val);
            populate(input, node.left);
        }
        System.out.print("Do you want to add the right Node of " + node.val + " ");
        boolean right = input.nextBoolean();
        if(right){
            System.out.print("Enter the value of right Node of " + node.val + " ");
            int val = input.nextInt();
            node.right = new Node(val);
            populate(input, node.right);
        }
    }

    void display() {
        display(this.root, "");
    }

    void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}

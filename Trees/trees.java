package Trees;

import java.util.Scanner;

public class trees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(input);
//        tree.display();

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(9);
        tree.display();
    }
}

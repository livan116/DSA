package Trees;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;
    //constructor to intialize a node.
    public Node(int key){
        data = key;
        left = null;
        right = null;
    }
}

public class BinaryTree_Implementation {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        List <Integer> tree = new ArrayList<>();
        tree.add(root.data);
        tree.add(root.left.data);
        tree.add(root.right.data);
        System.out.println(tree);
    }
}

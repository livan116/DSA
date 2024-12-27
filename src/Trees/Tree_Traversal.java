package Trees;

import java.util.ArrayList;

public class Tree_Traversal {

    static ArrayList<Integer> Result(Node root){
        ArrayList<Integer> list = new ArrayList<>();
//        preOrder(root,list);
//        inOrder(root,list);
        postOrder(root,list);
        return list;
    }

    static void inOrder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);
    }

    static void preOrder(Node root , ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        arr.add(root.data);
        preOrder(root.left,arr);
        preOrder(root.right,arr);

    }

    static void postOrder(Node root,ArrayList<Integer> arr){
        if(root == null) return;
        postOrder(root.left,arr);
        postOrder(root.right,arr);
        arr.add(root.data);
    }


    public static void main(String[] args) {
//        ArrayList<Integer> li =
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(Result(root));

    }
}

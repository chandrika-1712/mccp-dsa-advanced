//construct a binary search tree of n nodes and print the values of bst using inorder,preorder,postorder traversal
import java.util.Scanner;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left=right=null;
    }
}
class BSTTraversal{
    static Node root = null;
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            // If tree is empty
            if (root == null) {
                root = newNode;
            } else {
                Node current = root;
                Node parent = null;
                while (current != null) {
                    parent = current;

                    if (value < current.data)
                        current = current.left;
                    else
                        current = current.right;
                }

                if (value < parent.data)
                    parent.left = newNode;
                else
                    parent.right = newNode;
            }
        }
        System.out.println("\nInorder Traversal:");
        inorder(root);
        System.out.println("\nPreorder Traversal:");
        preorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
        sc.close();
    }
}

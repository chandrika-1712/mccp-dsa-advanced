// Height of Binary Search Tree using Iteration
import java.util.*;
import java.util.LinkedList;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class HeightOfBSTUsingIteration{
 public static int height(Node root) {
    if (root == null)
        return 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int height = 0;
    while (!q.isEmpty()) {
        int size = q.size();  
        height++;              
        for (int i = 0; i < size; i++) {
            Node temp = q.poll();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }
    return height;
}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
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
        System.out.println("Height of BST is: " + height(root));
        sc.close();
    }
}
//Next right node of x in BST
import java.util.*;
import java.util.LinkedList;
class BSTNextRightNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Insert node into BST
    static Node insert(Node root, int data) {

        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Find next right node in same level
    static Node nextRightNode(Node root, int x) {

        if (root == null)
            return null;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node current = q.poll();

                if (current.data == x) {

                    if (i == size - 1)
                        return null; // no next right node
                    else
                        return q.peek(); // next right node
                }

                if (current.left != null)
                    q.offer(current.left);

                if (current.right != null)
                    q.offer(current.right);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.print("Enter value to find next right node: ");
        int x = sc.nextInt();

        Node result = nextRightNode(root, x);

        if (result == null)
            System.out.println("No next right node exists.");
        else
            System.out.println("Next right node of " + x + " is: " + result.data);
    }
}
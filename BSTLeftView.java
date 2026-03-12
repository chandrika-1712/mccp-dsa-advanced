import java.util.*;
import java.util.LinkedList;
class BSTLeftView {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    static Node insert(Node root, int data) {

        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Left View
    static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                // first node of each level
                if (i == 0)
                    result.add(current.data);
                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        ArrayList<Integer> ans = leftView(root);

        System.out.println("Left View of BST: " + ans);
    }
}
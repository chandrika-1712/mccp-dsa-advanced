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
class NodesAtSpecificLevel{
    public static void printNodesAtLevel(Node root, int level) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int currentLevel = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            if (currentLevel == level) {
                for (int i = 0; i < size; i++) {
                    Node temp = q.poll();
                    System.out.print(temp.data + " ");
                }
                return;
            }
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }

            currentLevel++;
        }

        System.out.println("Level does not exist");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        // BST insertion inside loop
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

        System.out.println("Enter level:");
        int level = sc.nextInt();

        System.out.println("Nodes at level " + level + " are:");
        printNodesAtLevel(root, level);

        sc.close();
    }
}
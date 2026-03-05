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

class WidthOfSpecificLevel {
    public static int widthAtLevel(Node root, int level) {
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int currentLevel = 1;
        while (!q.isEmpty()) {

            int size = q.size();

            if (currentLevel == level)
                return size;
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }
            currentLevel++;
        }
        return -1;
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

        System.out.println("Enter level to find width:");
        int level = sc.nextInt();

        int width = widthAtLevel(root, level);

        System.out.println("Width at level " + level + " is: " + width);

        sc.close();
    }
}
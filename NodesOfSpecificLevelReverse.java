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
public class NodesOfSpecificLevelReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (root == null) {
                root = newNode;
            } else {

                Node temp = root;
                Node parent = null;

                while (temp != null) {
                    parent = temp;

                    if (val < temp.data)
                        temp = temp.left;
                    else
                        temp = temp.right;
                }

                if (val < parent.data)
                    parent.left = newNode;
                else
                    parent.right = newNode;
            }
        }

        System.out.println("Enter level:");
        int level = sc.nextInt();

        printNodesAtLevelReverse(root, level);
    }

    public static void printNodesAtLevelReverse(Node root, int level) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int currentLevel = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            if (currentLevel == level) {
                Node[] arr = new Node[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = q.poll();
                }

                for (int i = size - 1; i >= 0; i--) {
                    System.out.print(arr[i].data + " ");
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
}
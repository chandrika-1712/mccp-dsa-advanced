import java.util.*;
import java.util.LinkedList;
class LevelNodeCount {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    static HashMap<Integer, Integer> levelCount(Node root) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if (root == null)
            return map;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int level = 1;

        while (!q.isEmpty()) {

            int size = q.size();
            map.put(level, size);

            for (int i = 0; i < size; i++) {

                Node cur = q.poll();

                if (cur.left != null)
                    q.offer(cur.left);

                if (cur.right != null)
                    q.offer(cur.right);
            }

            level++;
        }

        return map;
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

        HashMap<Integer, Integer> result = levelCount(root);

        System.out.println("Level and Node Count:");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Level " + entry.getKey() + " -> " + entry.getValue() + " nodes");
        }
    }
}
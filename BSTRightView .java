import java.util.*;

class BSTRightView {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) 
		   return res;
	   
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node cur = q.poll();

                if (i == size - 1) 
					res.add(cur.data);

                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        ArrayList<Integer> ans = rightView(root);
        System.out.println(ans);
    }
}
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeSortArray{

    static Node root = null;
    static int index = 0;

    // Iterative Insert
    static Node insert(Node root, int value) {

        Node newNode = new Node(value);

        if (root == null)
            return newNode;

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

        return root;
    }

    // Inorder Traversal (store in array)
    static void inorder(Node root, int[] sorted) {
        if (root != null) {
            inorder(root.left, sorted);
            sorted[index++] = root.data;
            inorder(root.right, sorted);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Insert array into BST
        for (int i = 0; i < n; i++) {
            root = insert(root, arr[i]);
        }

        // Step 2: Create sorted array
        int sorted[] = new int[n];

        // Step 3: Store inorder into sorted array
        inorder(root, sorted);

        // Step 4: Print sorted array
        System.out.println("\nSorted Array (Tree Sort):");
        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }

        sc.close();
    }
}
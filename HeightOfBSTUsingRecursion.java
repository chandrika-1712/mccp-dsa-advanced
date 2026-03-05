//1. Height of Binary Search Tree using Recursion 
import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class HeightOfBSTUsingRecursion{
 public static int height(Node root){
   if(root==null)
    return 0;
   else{
	 int ln=height(root.left);
	 int rn=height(root.right);
	 if(ln>rn)
	  return 1+ln;
	 else 
	  return 1+rn;
   }
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
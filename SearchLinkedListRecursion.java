//search linkedlist using iteration
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SearchLinkedListRecursion{
    public static boolean searchRecursive(Node head, int key) {

        if (head == null)
            return false;

        if (head.data == key)
            return true;

        return searchRecursive(head.next, key);
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, temp = null;

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        System.out.println("\nLinked List:");
        display(head);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

         // Recursive Search
        boolean foundRecursive = searchRecursive(head, key);
        if (foundRecursive)
            System.out.println("Element found (Recursive)");
        else
            System.out.println("Element NOT found (Recursive)");

        sc.close();
    }
}
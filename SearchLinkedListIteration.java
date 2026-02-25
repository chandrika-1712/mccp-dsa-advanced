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
public class SearchLinkedListIteration{
    public static boolean searchIterative(Node head, int key) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
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

        // Iterative Search
        boolean foundIterative = searchIterative(head, key);
        if (foundIterative)
            System.out.println("Element found (Iterative)");
        else
            System.out.println("Element NOT found (Iterative)");

        sc.close();
    }
}
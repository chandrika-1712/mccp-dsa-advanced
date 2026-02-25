//segregation of linkedlist so that all even position nodes first then odd position nodes
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SegregationEvenandOddPositions{
    public static Node evenThenOdd(Node head) {
    if (head == null || head.next == null)
        return head;
    Node odd = head;
    Node even = head.next;
    Node evenHead = even;
    while (even != null && even.next != null) {

        odd.next = even.next;
        odd = odd.next;

        even.next = odd.next;
        even = even.next;
    }
    // Terminate odd list
    odd.next = null;
    // Attach odd list after even list
    Node temp = evenHead;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = head;

    return evenHead;
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

        Node head = null;
        Node temp = null;

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
        System.out.println("Original Linked List:");
        display(head);
        head =evenThenOdd(head);
        System.out.println("After segregation Linked List:");
        display(head);

        sc.close();

    }
}
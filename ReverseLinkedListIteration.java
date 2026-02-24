//reverse the linkedlist using iteration
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedListIteration{
    public static Node reverse(Node head) {
        Node prev=null;
		Node curr=head;
		Node next1=null;
		while (curr != null){
		  next1=curr.next;
		  curr.next=prev;
		  prev=curr;
		  curr=next1;
		}
		return prev;
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

        head = reverse(head);

        System.out.println("Reversed Linked List:");
        display(head);

        sc.close();

    }
}
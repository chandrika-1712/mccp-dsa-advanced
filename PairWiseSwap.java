//reverse the linkedlist using Stack and modifying the elements in the linkedlist
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class PairWiseSwap{
    public static Node swap(Node head) {
	    if(head==null||head.next==null)
		 return head;
        Node curr=head;
		Node prev=null;
		head=head.next;
		while(curr!=null&&curr.next!=null){
		   Node next=curr.next;
		   Node nextpair=next.next;
		   next.next=curr;
		   curr.next=nextpair;
		   if(prev!=null)
		    prev.next=next;
		   prev=curr;
		   curr=nextpair;
		}
		return head;
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

        head =swap(head);

        System.out.println("PairWise swapped Linked List:");
        display(head);

        sc.close();

    }
}
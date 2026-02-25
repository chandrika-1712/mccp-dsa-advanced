//segregation of linkedlist so that all even valued nodes first then odd value nodes
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SegragationOfEvenandthenOddvalues{
    public static Node segregation(Node head) {
	    if(head==null||head.next==null)
		 return head;
		Node evenhead=null,eventail=null;
		Node oddhead=null,oddtail=null;
		Node curr=head;
		while(curr!=null){
		  Node nextnode=curr.next;
		  curr.next=null;
		  if(curr.data%2==0){
		    if(evenhead==null){
			 evenhead=eventail=curr;
			}
			else{
			 eventail.next=curr;
			 eventail=curr;
			}
		  }
		  else{
		    if (oddhead == null){
               oddhead=oddtail=curr;
            }
			else {
                oddtail.next=curr;
                oddtail=curr;
            }
		  }
		  curr=nextnode;
		}
        if (evenhead != null) {
            head = evenhead;
            eventail.next = oddhead;
        } else {
            head = oddhead;  // if no even nodes
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
        head =segregation(head);
        System.out.println("After segregation Linked List:");
        display(head);

        sc.close();

    }
}
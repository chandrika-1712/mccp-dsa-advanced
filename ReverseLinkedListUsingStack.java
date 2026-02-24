//reverse the linkedlist using recursion
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedListUsingStack{
    public static Node reverse(Node head) {
        Stack<Integer> st=new Stack<>();
		Node p=head;
		while(p!=null){
			st.push(p.data);
			p=p.next;
		}
		p=head;
		while(!st.isEmpty()){
			p.data=st.pop();
			p=p.next;
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

        head = reverse(head);

        System.out.println("Reversed Linked List:");
        display(head);

        sc.close();

    }
}
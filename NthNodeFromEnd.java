//nth node from the end
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthNodeFromEnd{
    public static int findNthFromEnd(Node head, int n) {
        if (head == null)
            return -1;

        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return -1; 
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null, temp = null;
        char choice;

        // Creating Linked List
        do {
            System.out.print("Enter data: ");
            int data = sc.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.print("Enter position from end (n): ");
        int n = sc.nextInt();

        int result = findNthFromEnd(head, n);

        if (result != -1)
            System.out.println(n + "th node from end is: " + result);
        else
            System.out.println("Position exceeds list length.");

        sc.close();
    }
}
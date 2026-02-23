import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthNodeFromBeginning{

    // Method to find nth node from beginning
    public static int findNthNode(Node head, int n) {
        Node temp = head;
        int count = 1;

        while (temp != null) {
            if (count == n)
                return temp.data;

            temp = temp.next;
            count++;
        }

        return -1;  // if n is greater than length
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

        System.out.print("Enter position (n): ");
        int n = sc.nextInt();

        int result = findNthNode(head, n);

        if (result != -1)
            System.out.println(n + "th node value is: " + result);
        else
            System.out.println("Position exceeds list length.");

        sc.close();
    }
}
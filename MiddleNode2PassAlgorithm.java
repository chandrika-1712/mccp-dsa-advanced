//construct a linkedlist of unknown number of nodes now find and retun value of middle node
//using 2 pass algorithm
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNode2PassAlgorithm{

    // 2-Pass Method to find middle node
    public static int findMiddle(Node head) {
        Node temp = head;
        int count = 0;
        // First Pass - Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        if (temp != null)
            return temp.data;

        return -1;  // if list is empty
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

        int middleValue = findMiddle(head);

        if (middleValue != -1)
            System.out.println("Middle node value is: " + middleValue);
        else
            System.out.println("Linked list is empty.");

        sc.close();
    }
}
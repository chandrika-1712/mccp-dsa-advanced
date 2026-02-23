//construct a linkedlist of unknown number of nodes now find and retun value of middle node
//using 1 pass algorithmimport java.util.Scanner;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNode1PassAlgorithm{
    public static int findMiddle(Node head) {
        if (head == null)
            return -1;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;   
            fast = fast.next.next;  
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null, temp = null;
        char choice;
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
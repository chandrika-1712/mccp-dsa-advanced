import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MoveLastToFrontIterative{
    static Node moveLastToFront(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node secondLast = null;
        Node last = head;

        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }

        secondLast.next = null;
        last.next = head;

        return last; // new head
    }
    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;
        Node temp = null;

        System.out.println("Enter node values (space separated):");

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

        System.out.println("Original List:");
        printList(head);

        head = moveLastToFront(head);

        System.out.println("After Moving Last To Front:");
        printList(head);

        sc.close();
    }
}
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListLengthRecursion{
    public static int getLengthRecursive(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + getLengthRecursive(head.next);
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
        System.out.println("Length using Recursion: " + getLengthRecursive(head));
        sc.close();
    }
}
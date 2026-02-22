import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{

    Node head = null;

    // Insert at Beginning
    void insertBegin(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        System.out.println("Inserted Successfully");
    }

    // Insert at End
    void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("Inserted Successfully");
    }

    // Insert at Position
    void insertPosition(int data, int pos) {

        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println("Inserted Successfully");
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Inserted Successfully");
    }

    // Delete from Beginning
    void deleteBegin() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
        System.out.println("Deleted Successfully");
    }

    // Delete from End
    void deleteEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Deleted Successfully");
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
        System.out.println("Deleted Successfully");
    }

    // Delete from Position
    void deletePosition(int pos) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            head = head.next;
            System.out.println("Deleted Successfully");
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 1; i < pos && temp != null; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        prev.next = temp.next;
        System.out.println("Deleted Successfully");
    }

    // Traversal
    void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class LinkedListOperationsMenu{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice, subchoice, data, pos;

        while (true) {

            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traversal");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    System.out.println("\n--- INSERT MENU ---");
                    System.out.println("1. Beginning");
                    System.out.println("2. End");
                    System.out.println("3. Position");
                    System.out.print("Enter choice: ");
                    subchoice = sc.nextInt();

                    if (subchoice == 1)
                        list.insertBegin(data);
                    else if (subchoice == 2)
                        list.insertEnd(data);
                    else if (subchoice == 3) {
                        System.out.print("Enter position: ");
                        pos = sc.nextInt();
                        list.insertPosition(data, pos);
                    } else
                        System.out.println("Invalid Choice");
                    break;

                case 2:
                    System.out.println("\n--- DELETE MENU ---");
                    System.out.println("1. Beginning");
                    System.out.println("2. End");
                    System.out.println("3. Position");
                    System.out.print("Enter choice: ");
                    subchoice = sc.nextInt();

                    if (subchoice == 1)
                        list.deleteBegin();
                    else if (subchoice == 2)
                        list.deleteEnd();
                    else if (subchoice == 3) {
                        System.out.print("Enter position: ");
                        pos = sc.nextInt();
                        list.deletePosition(pos);
                    } else
                        System.out.println("Invalid Choice");
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

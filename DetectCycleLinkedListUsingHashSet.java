import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycleLinkedListUsingHashSet {

    // Method 1: Using HashSet
    public static boolean detectCycleHashSet(Node head) {

        HashSet<Node> set = new HashSet<>();
        Node current = head;

        while (current != null) {

            if (set.contains(current)) {
                return true;   // Cycle detected
            }

            set.add(current);
            current = current.next;
        }

        return false;  // No cycle
    }

    // Method 2: Floyd’s Algorithm
    public static boolean detectCycleFloyd(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;           // 1 step
            fast = fast.next.next;      // 2 steps

            if (slow == fast) {
                return true;            // Cycle detected
            }
        }

        return false;  // No cycle
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter elements:");

        // Creating Linked List directly in for loop
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Optional: Create cycle
        System.out.print("Enter position to create cycle (0 for no cycle): ");
        int pos = sc.nextInt();

        if (pos > 0) {
            Node temp = head;
            Node cycleNode = null;
            int count = 1;

            while (temp.next != null) {

                if (count == pos) {
                    cycleNode = temp;
                }

                temp = temp.next;
                count++;
            }

            temp.next = cycleNode;   // Creating cycle
        }
        if (detectCycleHashSet(head))
            System.out.println("Cycle Detected (HashSet Method)");
        else
            System.out.println("No Cycle (HashSet Method)");
    }
}
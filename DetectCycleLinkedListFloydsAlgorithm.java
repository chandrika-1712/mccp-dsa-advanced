import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycleLinkedListFloydsAlgorithm {
    //Using HashSet
    public static boolean detectCycleFloyd(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;    
            fast = fast.next.next; 

            if (slow == fast) {
                return true;          
            }
        }
        return false;  
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
        if (detectCycleFloyd(head))
            System.out.println("Cycle Detected (Floyd Method)");
        else
            System.out.println("No Cycle (Floyd Method)");
    }
}
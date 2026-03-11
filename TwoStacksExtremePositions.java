//Using extreme positions
import java.util.*;

class TwoStacksExtremePositions {

    int arr[];
    int top1, top2, size;

    TwoStacksExtremePositions(int n) {
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void pop1() {
        if (top1 >= 0) {
            System.out.println("Popped from Stack1: " + arr[top1--]);
        } else {
            System.out.println("Stack1 Underflow");
        }
    }

    void pop2() {
        if (top2 < size) {
            System.out.println("Popped from Stack2: " + arr[top2++]);
        } else {
            System.out.println("Stack2 Underflow");
        }
    }

    void display() {
        System.out.println("Array Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TwoStacksExtremePositions s = new TwoStacksExtremePositions(10);

        int choice, value;

        do {
            System.out.println("\n1. Push Stack1 (Left Side)");
            System.out.println("2. Push Stack2 (Right Side)");
            System.out.println("3. Pop Stack1");
            System.out.println("4. Pop Stack2");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push1(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push2(value);
                    break;

                case 3:
                    s.pop1();
                    break;

                case 4:
                    s.pop2();
                    break;

                case 5:
                    s.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}
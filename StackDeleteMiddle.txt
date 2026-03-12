//delete middle element and return the stack
import java.util.*;
class StackDeleteMiddle {
    public static Stack<Integer> deleteMiddle(Stack<Integer> st) {
        int size = st.size();
        int mid = size / 2;
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < mid; i++) {
            temp.push(st.pop());
        }
        if (!st.isEmpty()) {
            st.pop();
        }
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return st;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");

        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        System.out.println("Original Stack: " + st);

        deleteMiddle(st);

        System.out.println("Stack after deleting middle element: " + st);
    }
}
//enqueue costly
import java.util.*;
class MyQueue{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // Enqueue (Costly)
    public void enqueue(int x) {

        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        st1.push(x);

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    // Dequeue
    public int dequeue() {
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.pop();
    }

    // Front element
    public int front() {
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.peek();
    }

    // Size
    public int size() {
        return st1.size();
    }

    // Display queue
    public void display() {
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        for(int i = st1.size()-1; i >=0; i--){
            System.out.print(st1.get(i) + " ");
        }
        System.out.println();
    }
}

public class QueueUsingTwoStacksEnqueueCostly{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();

        while(true){

            System.out.println("\n---- Queue Using Two Stacks ----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Size");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;

                case 2:
                    int val = q.dequeue();
                    if(val != -1)
                        System.out.println("Removed: " + val);
                    break;

                case 3:
                    int f = q.front();
                    if(f != -1)
                        System.out.println("Front: " + f);
                    break;

                case 4:
                    System.out.println("Size: " + q.size());
                    break;

                case 5:
                    q.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
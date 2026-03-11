// Build stack using 2 queues -Using push costly 
import java.util.*;
import java.util.LinkedList;
class StackUsingQueuePushCostly{
  Queue<Integer> q1=new LinkedList<>();
  Queue<Integer> q2=new LinkedList<>();
  void push(int x){
    q2.offer(x);
	while(!q1.isEmpty()){
	  q2.offer(q1.poll());
	}
	Queue<Integer> temp=q1;
	q1=q2;
	q2=temp;
  }
  int pop(){
    if(q1.isEmpty()) {
        System.out.println("Stack is empty");
         return -1;
    }
     return q1.poll();
  }
  int top(){
    if(q1.isEmpty()) {
        System.out.println("Stack is empty");
           return -1;
        }
     return q1.peek();
  }
  boolean isEmpty(){
    return q1.isEmpty();
  }
  void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int x : q1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackUsingQueue s = new StackUsingQueue();
        int choice, value;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. IsEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    System.out.println("Popped element: " + s.pop());
                    break;

                case 3:
                    System.out.println("Top element: " + s.top());
                    break;

                case 4:
                    System.out.println("Stack empty? " + s.isEmpty());
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

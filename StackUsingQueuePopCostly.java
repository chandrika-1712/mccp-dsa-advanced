import java.util.*;
import java.util.LinkedList;
class StackUsingQueuePopCostly{

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.offer(x);
    }

    int pop() {
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int popped = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    int top() {
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int top = q1.peek();
        q2.offer(q1.poll());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    boolean isEmpty(){
        return q1.isEmpty();
    }

    void display(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for(int x : q1){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StackUsingQueue s = new StackUsingQueue();
        int choice,val;

        do{
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Top");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter element: ");
                    val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    System.out.println("Popped: " + s.pop());
                    break;

                case 3:
                    System.out.println("Top: " + s.top());
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice != 5);
    }
}
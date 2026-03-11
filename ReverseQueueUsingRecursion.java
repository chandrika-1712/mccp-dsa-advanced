import java.util.*;
import java.util.LinkedList;
class ReverseQueueUsingRecursion {
    static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty())
            return;
        int x = q.poll();
        reverseQueue(q);
        q.offer(x);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter queue elements:");

        for(int i=0;i<n;i++){
            q.offer(sc.nextInt());
        }
        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }
}
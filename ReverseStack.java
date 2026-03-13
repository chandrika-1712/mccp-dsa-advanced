import java.util.*;

public class ReverseStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");

        for(int i=0;i<n;i++){
            s1.push(sc.nextInt());
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        System.out.println("Reversed Stack:");
        System.out.println(s2);
    }
}
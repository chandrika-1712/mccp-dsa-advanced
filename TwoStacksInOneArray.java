//Implement stack in single Array-3 methods Using equal size, first half, second half
import java.util.*;

class TwoStacksInOneArrayEqualSize{
    int arr[];
    int top1, top2, n;

    TwoStacksInOneArrayEqualSize(int size) {
        n = size;
        arr = new int[n];
        top1 = -1;
        top2 = n/2 - 1;
    }

    void push1(int x) {
        if(top1 < n/2 - 1)
            arr[++top1] = x;
        else
            System.out.println("Stack1 Overflow");
    }

    void push2(int x) {
        if(top2 < n - 1)
            arr[++top2] = x;
        else
            System.out.println("Stack2 Overflow");
    }

    void pop1() {
        if(top1 >= 0)
            System.out.println("Popped: " + arr[top1--]);
        else
            System.out.println("Stack1 Underflow");
    }

    void pop2() {
        if(top2 >= n/2)
            System.out.println("Popped: " + arr[top2--]);
        else
            System.out.println("Stack2 Underflow");
    }

    void display() {
        System.out.println("Array Elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TwoStacksInOneArrayEqualSize s = new TwoStacksInOneArrayEqualSize(10);
        int ch,val;

        do{
            System.out.println("\n1.Push Stack1\n2.Push Stack2\n3.Pop Stack1\n4.Pop Stack2\n5.Display\n6.Exit");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    s.push1(val);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    s.push2(val);
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
            }

        }while(ch!=6);
    }
}
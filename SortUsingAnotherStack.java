//given a stack data structure sort the elements of the Stack using another stack
import java.util.*;
class SortUsingAnotherStack{
  static Stack<Integer> sort(Stack<Integer> st){
    Stack<Integer> temp=new Stack<>();
	while(!st.isEmpty()){
        int x=st.pop();
		while(!temp.isEmpty()&&temp.peek()<x)
		{
		  st.push(temp.pop());
		}
		temp.push(x);
	}
	return temp;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter stack elements:");
        for(int i=0;i<n;i++){
            s1.push(sc.nextInt());
        }
		Stack<Integer> st=sort(s1);
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+" ");
		}
  }
}
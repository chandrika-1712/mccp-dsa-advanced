//sliding window and deque
import java.util.*;
public class Min4{
  public static int[] findMaxSum(int a[],int n,int k){
    int res[]=new int[n-k+1];
	Deque<Integer> dq=new LinkedList<>();
	for(int i=0;i<k;i++){
	  while(!dq.isEmpty()&&a[dq.peekLast()]>=a[i]){
	    dq.removeLast();
	  }
	  dq.addLast(i);
	}
	res[0]=a[dq.peekFirst()];
	for(int i=k;i<n;i++){
	  while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
	    dq.removeFirst();
	  }
	  while(!dq.isEmpty()&&a[dq.peekLast()]>=a[i]){
	    dq.removeLast();
	  }
	  dq.addLast(i);
	  res[i-k+1]=a[dq.peekFirst()];
	}
	return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter n:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter array elements:");
	for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
	}
	System.out.print("Enter k:");
	int k=sc.nextInt();
	int res[]=findMaxSum(arr,n,k);
	for(int x:res){
	 System.out.print(x+" ");
	}
   }
  }
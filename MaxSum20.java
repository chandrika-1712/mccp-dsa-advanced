import java.util.*;
public class MaxSum20{
  public static int[] findMaxSum(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<k;i++){
	 pq.add(arr[i]);
	}
	res[0]=pq.peek();
	for(int i=1;i<=n-k;i++){
	  pq.add(arr[i+k-1]);
	  pq.remove(arr[i-1]);
	  res[i]=pq.peek();
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
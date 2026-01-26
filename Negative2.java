import java.util.*;
public class Negative2{
  public static int[] findNegative(int a[],int n,int k){
    int res[]=new int[n-k+1];
	int j=0;
	Deque<Integer> dq=new LinkedList<>();
	for(int i=0;i<n;i++){
	   if(a[i]<0)
	    dq.addLast(i);
	   if(!dq.isEmpty()&&dq.peekFirst()<=i-k)
	    dq.pollFirst();
	   if(i>=k-1){
	     if(dq.isEmpty()){
		   res[j++]=0;
		 }
		 else{
		  res[j++]=a[dq.peekFirst()];
		 }
	   } 
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
	int res[]=findNegative(arr,n,k);
	for(int x:res){
	 System.out.print(x+" ");
	}
   }
  }
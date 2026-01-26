import java.util.*;
public class MaxSum4{
  public static ArrayList<Integer> findMaxSum(int arr[],int n,int k){
    ArrayList<Integer> al=new ArrayList<>();
	int s=0;
	for(int i=0;i<=n-k;i++){
	  s=0;
	  for(int j=i;j<i+k;j++){
	   s=s+arr[j];
	  }
	  al.add(s);
	}
	return al;
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
	ArrayList<Integer> res=findMaxSum(arr,n,k);
	for(int x:res){
	 System.out.print(x+" ");
	}
   }
  }
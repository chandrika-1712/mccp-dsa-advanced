import java.util.*;
public class MaxSum1{
  public static int[] findMaxSum(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	int s=0;
	for(int i=0;i<=n-k;i++){
	  s=0;
	  for(int j=i;j<i+k;j++){
	   s=s+arr[j];
	  }
	  res[i]=s;
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
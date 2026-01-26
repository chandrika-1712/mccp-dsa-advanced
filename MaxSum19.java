import java.util.*;
public class MaxSum19{
  public static int[] findMaxSum(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	for(int i=0;i<=n-k;i++){
	  int max=arr[i];
	  for(int j=i+1;j<i+k;j++){
	    if(arr[j]>max)
		 max=arr[j];
	  }
	  res[i]=max;
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
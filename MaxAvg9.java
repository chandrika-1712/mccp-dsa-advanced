import java.util.*;
public class MaxAvg9{
  public static int[] findMaxAvg(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	int s=0;
	for(int i=0;i<k;i++){
	  s=s+arr[i];
	}
	res[0]=s/k;
	for(int i=k;i<n;i++){
	 s=s+arr[i];
	 s=s-arr[i-k];
	 res[i-k+1]=s/k;
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
	int res[]=findMaxAvg(arr,n,k);
	for(int x:res){
	 System.out.print(x+" ");
	}
   }
  }
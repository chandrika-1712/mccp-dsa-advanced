import java.util.*;
public class MaxAvg10{
  public static int findMaxAvg(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	int s=0;
	for(int i=0;i<=n-k;i++){
	  s=0;
	  for(int j=i;j<i+k;j++){
	   s=s+arr[j];
	  }
	  res[i]=s;
	}
	int max=res[0];
	for(int i:res){
	 max=Math.max(i,max);
	}
	return max;
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
	 System.out.print("Max Value:"+findMaxAvg(arr,n,k));
   }
  }
import java.util.*;
public class MaxAvg13{
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
	int min=res[0];
	for(int i:res){
	 min=Math.min(i,min);
	}
	return min;
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
	 System.out.print("Min Value:"+findMaxAvg(arr,n,k));
   }
  }
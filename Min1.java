import java.util.*;
public class Min1{
  public static int[] find(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	for(int i=0;i<=n-k;i++){
	  int min=arr[i];
	  for(int j=i+1;j<i+k;j++){
	    if(arr[j]<min)
		 min=arr[j];
	  }
	  res[i]=min;
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
	int res[]=find(arr,n,k);
	for(int x:res){
	 System.out.print(x+" ");
	}
   }
  }
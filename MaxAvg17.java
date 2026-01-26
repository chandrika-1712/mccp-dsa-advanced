import java.util.*;
public class MaxAvg17{
  public static ArrayList<Integer> findMaxAvg(int arr[],int n,int k){
    int res[]=new int[n-k+1];
	int s=0;
	for(int i=0;i<k;i++){
	  s=s+arr[i];
	}
	res[0]=s;
	for(int i=1;i<=n-k;i++){
	 s=s+arr[i+k-1];
	 s=s-arr[i-1];
	 res[i]=s;
	}
	int min=res[0];
	for(int i:res){
	 min=Math.min(i,min);
	}
	int max=res[0];
	for(int i:res){
	 max=Math.max(i,max);
	}
	return new ArrayList<>(Arrays.asList(min,max));
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
	ArrayList<Integer> al=findMaxAvg(arr,n,k);
	for(int i:al){
	 System.out.print(i+" ");
	}
   }
  }
import java.util.*;
public class Unique1{
  public static int[] find(int a[],int n,int k){
    int res[]=new int[n-k+1];
	for(int i=0;i<=n-k;i++){
	  HashSet<Integer> hs=new HashSet<>();
	  for(int j=i;j<i+k;j++){
	    hs.add(a[j]);
	  }
	  res[i]=hs.size();
	}
	return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter n:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter array elements:");
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
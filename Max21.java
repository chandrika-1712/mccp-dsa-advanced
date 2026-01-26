import java.util.*;
public class Max21{
  public static int[] findMaxSum(int a[],int n,int k){
    int res[]=new int[n-k+1];
	TreeMap<Integer,Integer> tm=new TreeMap<>();
	for(int i=0;i<k;i++){
	  tm.put(a[i],tm.getOrDefault(a[i],0)+1);
	}
	res[0]=tm.lastKey();
	for(int i=1;i<=n-k;i++){
	  tm.put(a[i+k-1],tm.getOrDefault(a[i+k-1],0)+1);
	  tm.put(a[i-1],tm.get(a[i-1])-1);
	  if(tm.get(a[i-1])==0)
	   tm.remove(a[i-1]);
	   res[i]=tm.lastKey();
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
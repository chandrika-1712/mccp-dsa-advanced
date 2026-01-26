import java.util.*;
public class Unique2{
  public static int[] find(int a[],int n,int k){
    int res[]=new int[n-k+1];
	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<k;i++){
	  hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	}
	res[0]=hm.size();
	for(int i=1;i<=n-k;i++){
	 hm.put(a[i+k-1],hm.getOrDefault(a[i+k-1],0)+1);
	 hm.put(a[i-1],hm.get(a[i-1])-1);
	 if(hm.get(a[i-1])==0)
	 {
	   hm.remove(a[i-1]);
	 }
	 res[i]=hm.size();
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
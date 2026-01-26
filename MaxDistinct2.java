//sliding window
import java.util.*;
public class MaxDistinct2{
  public static int find(int a[],int n,int k){
	int max=0;
	int sum=0;
	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<k;i++){
		sum+=a[i];
	   hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	}
	if(hm.size()==k)
	{
	 max=sum;
	}
	for(int i=k;i<n;i++){
	   sum+=a[i];
	   hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	   sum-=a[i-k];
	   hm.put(a[i-k],hm.get(a[i-k])-1);
	   if(hm.get(a[i-k])==0)
	    hm.remove(a[i-k]);
	   if(hm.size()==k)
	   {
	    max=Math.max(sum,max);
	  }
	}
	return max;
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
	System.out.println("Enter k:");
	int k=sc.nextInt();
	System.out.println("maxsum is:"+find(arr,n,k));
   }
  }
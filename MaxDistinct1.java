//Bruteforce
import java.util.*;
public class MaxDistinct1{
  public static int find(int a[],int n,int k){
	int max=0;
	for(int i=0;i<=n-k;i++){
	   int sum=0;
	   HashSet<Integer> hs=new HashSet<>();
	   for(int j=i;j<i+k ;j++){
		 if(hs.contains(a[j]))
		   break;
	     hs.add(a[j]);
		 sum+=a[j];
	   }
	   if(hs.size()==k){
	    max=Math.max(max,sum);
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
//return length of longest subarray whose sum is equal to target
import java.util.*;
public class LongestSublen3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter n:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter array elements:");
	for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
	}
	System.out.print("Enter target:");
	int target=sc.nextInt();
	System.out.println("Longest sub array length is:"+LongestSubarray(arr,n,target));
  }
  //Hashmap2
  public static int LongestSubarray(int arr[],int n,int target){
	HashMap<Integer,Integer> hm=new HashMap<>();
	int res=0;
	int psum=0;
	hm.put(0,-1);
	for(int i=0;i<n;i++){
	   psum+=arr[i];
	   if(hm.containsKey(psum-target)){
	     int len=i-hm.get(psum-target);
		   if(len>res){
		     res=len;
		   }
	   }
	   if(!hm.containsKey(psum)){
	     hm.put(psum,i);
	   }
	 }
	return res;
   }
  }
//return count of subarrays whose sum is equal to target
import java.util.*;
public class SubArrCount2{
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
	System.out.println("count:"+LongestSubarray(arr,n,target));
  }
  //Sliding window
  public static int LongestSubarray(int arr[],int n,int target){
    int count=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
	int psum=0;
	for(int i=0;i<n;i++){
	   psum+=arr[i];
	   if(psum==target){
	    count++;
	   }
	   else if(hm.containsKey(psum-target)){
		   count+=hm.get(psum-target);
	   }
	   hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
	 }
	return count;
   }
  }
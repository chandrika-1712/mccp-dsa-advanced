//return count of subarrays whose sum is equal to target
import java.util.*;
public class SubArrCount1{
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
  //bruteforce
  public static int LongestSubarray(int arr[],int n,int target){
    int count=0;
	for(int i=0;i<n;i++){
	  int psum=0;
	  for(int j=i;j<n;j++){
	    psum+=arr[j];
		if(psum==target){
		  count++;
		}
	  }
	}
	return count;
   }
  }
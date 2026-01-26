//return longest subarray elements whose sum is equal to target
import java.util.*;
public class LongestSub1{
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
	int ans[]=LongestSubarray(arr,n,target);
	for(int i:ans){
	 System.out.print(i+" ");
   }
  }
  public static int[] LongestSubarray(int arr[],int n,int target){
    int res=0;
	int end=0;
	for(int i=0;i<n;i++){
	  int psum=0;
	  for(int j=i;j<n;j++){
	    psum+=arr[j];
		if(psum==target){
		  int len=j-i+1;
		  if(len>res){
		   res=len;
		   end=j;
		  }
		}
	  }
	}
	if (end ==-1){
        return new int[0];
    }
	int ans[]=new int[res];
	int k=0;
	int start=end-res+1;
	for(int i=start;i<=end;i++){
	   ans[k++]=arr[i];
	}
	return ans;
   }
  }
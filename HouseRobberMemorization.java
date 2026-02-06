/*Minimum path cost using DP Memorization 
if a thief visits two consecutive houses and alarm will rise.
Find the maximum amount of money thieft can steal without visiting consecutive houses*/
import java.util.*;
class HouseRobberMemorization{
  static int[] dp;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter Amount of money in each house:");
	for(int i=0;i<n;i++){
	 a[i]=sc.nextInt();
	}
	dp=new int[n];
	Arrays.fill(dp,-1);
	System.out.println("Maximum amount:"+max(a,n-1));
  }
  public static int max(int arr[],int n)
  {
    if(n==0)
	 return arr[0];
	if(n==1)
		return Math.max(arr[0],arr[1]);
     if(dp[n]!=-1)
	  return dp[n];
     int a=max(arr,n-2)+arr[n];
	 int b=max(arr,n-1);
	 dp[n]=Math.max(a,b);
	 return dp[n];
  }
 }
/*Minimum path cost using DP Tabulation 
if a thief visits two consecutive houses and alarm will rise.
Find the maximum amount of money thieft can steal without visiting consecutive houses*/
import java.util.*;
class HouseRobberTabulation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter Amount of money in each house:");
	for(int i=0;i<n;i++){
	 a[i]=sc.nextInt();
	}
	System.out.println("Maximum amount:"+max(a,n));
  }
  public static int max(int arr[],int n)
  {
	if(n==1)
		return 0;
    int dp[]=new int[n];
	dp[0]=arr[0];
	dp[1]=Math.max(arr[0],arr[1]);
	for(int i=2;i<n;i++){
	  int a=dp[i-2]+arr[i];
	  int b=dp[i-1];
	  dp[i]=Math.max(a,b);
	}
	return dp[n-1];
  }
 }
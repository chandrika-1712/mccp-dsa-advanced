//Minimum path cost using DP Tabulation
import java.util.*;
class MinCostPathTabulation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter m:");
	int m=sc.nextInt();
	System.out.println("Enter n:");
	int n=sc.nextInt();
	int[][] cost=new int[m][n];
	System.out.println("Enter cost matrix:");
	for(int i=0;i<m;i++){
	 for(int j=0;j<n;j++){
	   cost[i][j]=sc.nextInt();
	 }
	}
	System.out.println("Minimum path cost:"+minCostPath(m,n,cost));
  }
  public static int minCostPath(int m,int n,int cost[][])
  {
    int dp[][]=new int[m][n];
	dp[0][0]=cost[0][0];
	for(int i=1;i<m;i++){
	  dp[i][0]=dp[i-1][0]+cost[i][0];
	}
	for(int j=1;j<n;j++){
	  dp[0][j]=dp[0][j-1]+cost[0][j];
	}
	for(int i=1;i<m;i++){
	  for(int j=1;j<n;j++){
	    int min=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
		dp[i][j]=cost[i][j]+min;
	  }
	}
	return dp[m-1][n-1];
  }
 }
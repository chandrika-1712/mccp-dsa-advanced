//Minimum path cost using DP memorization
import java.util.*;
class MinCostPathMemorization{
  static int[][] dp;
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
	dp=new int[m][n];
	for(int[] row:dp){
	Arrays.fill(row,-1);
	}
	System.out.println("Minimum path cost:"+minCostPath(m,n,cost));
  }
  public static int minCostPath(int m,int n,int cost[][])
  {
    if(m<=0||n<=0)
	 return Integer.MAX_VALUE;
    if(m==1&&n==1)
		return cost[0][0];
	if(dp[m-1][n-1]!=-1)
		return dp[m-1][n-1];
	 int a=minCostPath(m-1,n-1,cost);
	 int b=minCostPath(m,n-1,cost);
	 int c=minCostPath(m-1,n,cost);
	 dp[m-1][n-1]=cost[m-1][n-1]+Math.min(a,Math.min(b,c));
	 return dp[m-1][n-1];
  }
 }
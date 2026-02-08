//length of Longest Common Subsequence using Memorization
import java.util.*;
class LenOfLongestSubSequenceMemorization{
  static int[][] dp;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String s1:");
	String s1=sc.next();
	System.out.println("Enter String s2:");
	String s2=sc.next();
	int m=s1.length();
	int n=s2.length();
	dp=new int[m+1][n+1];
	for(int[] row:dp){
	  Arrays.fill(row,-1);
	 }
	System.out.println("Length of Longest Common subsequence:"+LCS(s1,s2,m,n));
  }
  public static int LCS(String s1,String s2,int m,int n)
  {
    if(m==0||n==0)
	 return 0;
	if(dp[m][n]!=-1)
	 return dp[m][n];
	else if(s1.charAt(m-1)==s2.charAt(n-1))
	{
	  return 1+LCS(s1,s2,m-1,n-1);
	}
	else{
	  return Math.max(LCS(s1,s2,m-1,n),LCS(s1,s2,m,n-1));
	}
  }
 }
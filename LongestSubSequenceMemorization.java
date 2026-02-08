//return Longest Common Subsequence using Memorization
import java.util.*;
class LongestSubSequenceMemorization{
  static String[][] dp;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String s1:");
	String s1=sc.next();
	System.out.println("Enter String s2:");
	String s2=sc.next();
	int m=s1.length();
	int n=s2.length();
	dp=new String[m+1][n+1];
	System.out.println("Longest Common subsequence:"+LCS(s1,s2,m,n));
  }
  public static String LCS(String s1,String s2,int m,int n)
  {
    if(m==0||n==0)
	 return "";
	if(dp[m][n]!=null)
	 return dp[m][n];
	else if(s1.charAt(m-1)==s2.charAt(n-1))
	{
	  dp[m][n]=LCS(s1,s2,m-1,n-1)+s1.charAt(m-1);
	}
	else{
	  String s11=LCS(s1,s2,m-1,n);
	  String s22=LCS(s1,s2,m,n-1);
	  if(s11.length()>s22.length()){
	      dp[m][n]=s11;
	  }
	  else{
	       dp[m][n]=s22;
	  }
	}
	return dp[m][n];
  }
 }
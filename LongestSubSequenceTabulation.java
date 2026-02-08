//Return the Longest Common Subsequence using Tabulation
import java.util.*;
class LongestSubSequenceTabulation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String s1:");
	String s1=sc.next();
	System.out.println("Enter String s2:");
	String s2=sc.next();
	System.out.println("Longest Common subsequence:"+LCS(s1,s2));
  }
  public static String LCS(String s1,String s2)
  {
    int m=s1.length();
	int n=s2.length();
	int dp[][]=new int[m+1][n+1];
	for(int i=1;i<=m;i++){
	 for(int j=1;j<=n;j++){
	   if(s1.charAt(i-1)==s2.charAt(j-1)){
	     dp[i][j]=1+dp[i-1][j-1];
	   }
	   else{
	     dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	   }
	 }
	}
	StringBuilder sb=new StringBuilder();
	int i=m,j=n;
	while(i>0&&j>0){
	  if(s1.charAt(i-1)==s2.charAt(j-1))
	   {
	      sb.insert(0,s1.charAt(i-1));
		  i--;
		  j--;
	   }
	   else if(dp[i-1][j]>=dp[i][j-1])
	     i--;
	    else
		 j--;
	}
	return sb.toString();
  }
 }
//Count ways to reach nth stair with 1 or 2 steps using DP with Tabulation
import java.util.*;
class Stair1Or2Tabulation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("No.of ways to reach nth stair:"+countWays(n));
  }
  public static int countWays(int n)
  {
    if(n==1)
	 return 1;
    int f[]=new int[n+1];
	f[1]=1;
	f[2]=2;
	for(int i=3;i<=n;i++){
	  f[i]=f[i-1]+f[i-2];
	}
	return f[n];
  }
 }
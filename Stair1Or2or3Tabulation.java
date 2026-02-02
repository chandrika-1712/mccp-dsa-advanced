//Count ways to reach nth stair with 1 or 2 or 3 steps using DP with Tabulation
import java.util.*;
class Stair1Or2or3Tabulation{
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
	if(n==2)
	 return 2;
    int f[]=new int[n+1];
	f[1]=1;
	f[2]=2;
	f[3]=4;
	for(int i=4;i<=n;i++){
	  f[i]=f[i-1]+f[i-2]+f[i-3];
	}
	return f[n];
  }
 }
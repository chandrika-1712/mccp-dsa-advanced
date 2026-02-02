//Count ways to reach nth stair with 1 or 2 or 3steps using DP with Memorization- 
import java.util.*;
class Stair1Or2or3Memorization{
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
	else if(n==2)
	 return 2;
	else if(n==3)
	 return 4;
	else 
	 return countWays(n-1)+countWays(n-2)+countWays(n-3);
  }
 }
//MinOperations to move from n to 0
import java.util.*;
class MinOperationsNto0{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("Minimum Operations:"+findMin(n));
  }
  public static int findMin(int n)
  {
     int ans=0;
     while(n!=0){
	   if(n%2==0){
	     n=n/2;
		 ans++;
	   }
	   else{
	    n=n-1;
		ans++;
	   }
	 }
	 return ans;
  }
 }
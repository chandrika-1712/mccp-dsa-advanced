//nth fibonocci number -dp using memorization
import java.util.*;
class FibonocciDPMemorization{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("nth fibonocci number:"+fibo(n));
  }
  public static int fibo(int n)
  {
    if(n==1)
	 return 0;
	else if(n==2)
	 return 1;
	else 
	 return fibo(n-1)+fibo(n-2);
  }
 }

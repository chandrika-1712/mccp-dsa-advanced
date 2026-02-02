//nth fibonocci number -dp using Tabulation
import java.util.*;
class FibonocciDPTabulation{
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
    int f[]=new int[n+1];
	f[1]=0;
	f[2]=1;
	for(int i=3;i<=n;i++){
	  f[i]=f[i-1]+f[i-2];
	}
	return f[n];
  }
 }

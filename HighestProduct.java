//Highest product possilbe by any three elements from given array
import java.util.*;
class HighestProduct{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size:");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter arr elements:");
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  System.out.println("highest product:"+find(a,n));
  }
  public static int find(int a[],int n){
	Arrays.sort(a);
    int case1=a[n-1]*a[n-2]*a[n-3];
	int case2=a[0]*a[1]*a[n-1];
	return Math.max(case1,case2);
  }
 }
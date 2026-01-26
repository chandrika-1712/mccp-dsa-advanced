//Minimum number of operations to Make all elements of array equal
import java.util.*;
class Operations2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size:");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter arr elements:");
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  System.out.println("number of Operations:"+find(a,n));
  }
  public static int find(int a[],int n){
   Arrays.sort(a);
   int mid=a[n/2];
   int res=0;
   for(int i=0;i<n;i++){
    if(a[i]<mid){
	  res+=(mid-a[i]);
	}
	else{
	  res+=(a[i]-mid);
	}
   }
   return res;
  }
 }
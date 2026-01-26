//Minimum number of operations to Make two arrays equal
import java.util.*;
class Operations1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size:");
  int n=sc.nextInt();
  int a[]=new int[n];
  int b[]=new int[n];
  System.out.println("Enter arr1 elements:");
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  System.out.println("Enter arr2 elements:");
  for(int i=0;i<n;i++){
    b[i]=sc.nextInt();
  }
  System.out.println("number of Operations:"+find(a,b,n));
  }
  public static int find(int a[],int b[],int n){
   Arrays.sort(a);
   Arrays.sort(b);
   int res=0;
   for(int i=0;i<n;i++){
    if(a[i]<b[i]){
	  res+=(b[i]-a[i]);
	}
	else{
	  res+=(a[i]-b[i]);
	}
   }
   return res;
  }
 }
//Minimum number of tasks to complete in given time
import java.util.*;
class MaxTasks{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size:");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter arr elements:");
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
   System.out.println("Enter test size:");
  int T=sc.nextInt();
  System.out.println("number of Max Tasks:"+find(a,n,T));
  }
  public static int find(int a[],int n,int T){
   Arrays.sort(a);
   int res=0;
   int idx=0;
   while(idx<n&&T>=a[idx]){
      T -= a[idx];
      idx++;
      res++;
    }
   return res;
  }
 }
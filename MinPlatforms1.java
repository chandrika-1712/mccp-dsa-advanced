/*find minimum no of platforms required in railway station.given two arrays arrival and departure of size n.
using logic  1(both arrays are sorted)*/
import java.util.*;
class MinPlatforms1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter arrival times:");
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  int[] dep=new int[n];
  System.out.println("Enter departure times:");
  for(int i=0;i<n;i++){
    dep[i]=sc.nextInt();
  }
  System.out.println("Min Platforms:"+min(arr,dep,n));
 }
 public static int min(int arr[],int dep[],int n){
  Arrays.sort(arr);
  Arrays.sort(dep);
  int res=1,ans=1,i=1,j=0;
  while(i<n&&j<n){
   if(arr[i]<=dep[j]){
     ans++;
	 i++;
   }
   else{
    ans--;
	j++;
   }
   res=Math.max(ans,res);
  }
  return res;
 }
}
 
  
/*find minimum no of platforms required in railway station.given two arrays arrival and departure of size n.
using logic  2(priorityQueue)*/
import java.util.*;
class MinPlatforms2{
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
   int v[][]=new int[n][2];
   for(int i=0;i<n;i++){
     v[i][0]=arr[i];
	 v[i][1]=dep[i];
   }
   Arrays.sort(v,(a,b)->a[0]-b[0]);
   int res=0;
   PriorityQueue<Integer> pq=new PriorityQueue<>();
   for(int i=0;i<n;i++){
    while(!pq.isEmpty()&&pq.peek()<v[i][0]){
	 pq.poll();
	}
	pq.add(v[i][1]);
    res=Math.max(res,pq.size());
  }
  return res;
 }
}
 
  
 /*Activity Selection:find maximum no.of activities that person can person without overlapping .
using priority queue*/
import java.util.*;
class MaxActivitiesPriority{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("Enter start times:");
	int[] start=new int[n];
    for(int i=0;i<n;i++){
     start[i]=sc.nextInt();
   }
   int[] finish=new int[n];
   System.out.println("Enter finish times:");
   for(int i=0;i<n;i++){
    finish[i]=sc.nextInt();
   }
	System.out.println("Maximum activities:"+findMax(start,finish,n));
  }
  public static int findMax(int start[],int finish[],int n)
  {
    PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->x[1]-y[1]);
	for(int i=0;i<n;i++){
	  pq.add(new int[]{start[i],finish[i]});
	}
	int ans=0,ftime=-1;
	while(!pq.isEmpty()){
	  int z[]=pq.poll();
	  if(z[0]>ftime){ 
	    ans++;
		ftime=z[1];
	  }
	}
	return ans;
  }
 }
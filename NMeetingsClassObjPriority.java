 /*N meetings in one room.using PriorityQueue
using class objects+priority queue */
import java.util.*;
class NMeetingsClassObjPriority{
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
    PriorityQueue<Activity> pq=new PriorityQueue<>((x,y)->x.ftime-y.ftime);
	for(int i=0;i<n;i++){
	  pq.add(new Activity(start[i],finish[i]));
	}
	int ans=0,ftime=-1;
	while(!pq.isEmpty()){
	  Activity curr=pq.poll();
	  if(curr.stime>ftime){ 
	    ans++;
		ftime=curr.ftime;
	  }
	}
	return ans;
  }
 }
 class Activity{
    int stime,ftime;
	Activity(int stime,int ftime){
	  this.stime=stime;
	  this.ftime=ftime;
	}
 }
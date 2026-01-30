 /*N meetings in one room.using PriorityQueue
using class objects and sorting*/
import java.util.*;
class NMeetingsClassObjSorting{
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
    Activity a[]=new Activity[n];
	for(int i=0;i<n;i++){
	  a[i]=new Activity(start[i],finish[i]);
	}
	Arrays.sort(a,(x,y)->x.ftime-y.ftime);
	int ans=1,j=0;
	for(int i=1;i<n;i++){
	  if(a[i].stime>a[j].ftime){
	   ans++;
	   j=i;
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
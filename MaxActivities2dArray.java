/*Activity Selection:find maximum no.of activities that person can person without overlapping .
1.using 2d array and sorting*/
import java.util.*;
class MaxActivities2dArray{
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
    int a[][]=new int[n][2];
	for(int i=0;i<n;i++){
	  a[i][0]=start[i];
	  a[i][1]=finish[i];
	}
	Arrays.sort(a,(x,y)->x[1]-y[1]);
	int ans=1,j=0;
	for(int i=1;i<n;i++){
	  if(a[i][0]>a[j][1]){
	   ans++;
	   j=i;
	  }
	}
	return ans;
  }
 }
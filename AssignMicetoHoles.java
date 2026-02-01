 /*Assign Mice to Holes:
 There are n mice and n holes placed in straight line.all the mice moves concurrently at a time.
 what is the minimum time in which last mouse gets into a hole.*/
import java.util.*;
class AssignMicetoHoles{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("Enter mice positions:");
	int[] mice=new int[n];
    for(int i=0;i<n;i++){
     mice[i]=sc.nextInt();
   }
   int[] holes=new int[n];
   System.out.println("Enter holes positions:");
   for(int i=0;i<n;i++){
     holes[i]=sc.nextInt();
   }
	System.out.println("Minimum time:"+findMin(mice,holes,n));
  }
  public static int findMin(int mice[],int holes[],int n)
  {
    Arrays.sort(mice);
	Arrays.sort(holes);
	int max=0;
	for(int i=0;i<n;i++){
	  int a=Math.abs(mice[i]-holes[i]);
	  max=Math.max(a,max);
	}
	return max;
  }
 }

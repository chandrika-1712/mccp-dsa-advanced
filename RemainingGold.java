/*Remaining gold coin:
There is a bag filled with gold coins.v1 and v2 is largest elements 
i)if v1=v2 remove.
ii)else remove and insert v1-v2.*/
import java.util.*;
class RemainingGold{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("Enter values:");
	int[] bag=new int[n];
    for(int i=0;i<n;i++){
     bag[i]=sc.nextInt();
   }
	System.out.println("Remaining Gold in the bag:"+remaining(bag,n));
  }
  public static int remaining(int bag[],int n)
  {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
           pq.add(bag[i]);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        return pq.isEmpty()?0:pq.poll();
  }
 }

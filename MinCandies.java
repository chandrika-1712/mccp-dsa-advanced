/*2.Distributing candies:
there are n children standing in a line each child assigned a rating value,you are giving candies to children with the following requirements
	i)each children must have atleast 1 candy
	ii)children with hihger rating get more candies then their neighbours
find minimum no of candies to distribute to the children.*/
import java.util.*;
class MinCandies{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  System.out.println("Min Candies:"+min(arr,n));
 }
 public static int min(int arr[],int n){
  int ans=0;
  int[] candy=new int[n];
  Arrays.fill(candy,1);
  for(int i=1;i<n;i++){
   if(arr[i]>arr[i-1]){
     candy[i]=candy[i-1]+1;
   }
   }
   for(int i=n-2;i>=0;i--){
   if(arr[i]>arr[i+1]){
     candy[i]=Math.max(candy[i],candy[i+1]+1);
   }
   }
   for(int i:candy){
    ans+=i;
   }
   return ans;
 }
}
 
  
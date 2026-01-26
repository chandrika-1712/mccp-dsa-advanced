/*5.maximize the sum of the product array:
given array of n integers you are allowed to re arrange the elements of array in any order
.find maximum value of sum of the product of array[i]*i  */
import java.util.*;
class MaxSumOfArr{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  System.out.println("Max sum:"+max(arr,n));
 }
 public static int max(int arr[],int n){
  int ans=0;
  Arrays.sort(arr);
  for(int i=0;i<n;i++){
    ans+=(arr[i]*i);
  }
  return ans;
 }
}
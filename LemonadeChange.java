/*4.Lemonade change problem:
	You are given an array arr[] representing customers in a queue. 
	Each lemonade costs 5 coins, and arr[i] denotes the note a customer uses to pay (which can be 5, 10, or 20). 
	You must serve the customers in the given order and always provide the correct change so that each customer effectively pays exactly 5 coins. 
	Your task is to determine whether it is possible to serve all customers in the queue without ever running out of change.*/
import java.util.*;
class LemonadeChange{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  System.out.println(change(arr,n));
 }
 public static boolean change(int arr[],int n){
   int five=0,ten=0;
   for(int i:arr){
      if(i==5){
         five++;
       }
       else if(i==10){
          if(five==0){
            return false;
          }
          five--;
          ten++;
       }
       else{
        if(five>0&&ten>0){
          five--;
          ten--;
        }
        else if(five>=3){
          five-=3;
       }
        else{
           return false;
        }
     }
    }
   return true;
 }
}
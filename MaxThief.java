/*3.policeMen-catch Thieves:
	Given an array arr[], where each element contains either a 'P' for policeman or a 'T' for thief. Find the maximum number of thieves that can be caught by the police. 
	Keep in mind the following conditions :
	i)Each policeman can catch only one thief.
	ii)A policeman cannot catch a thief who is more than k units away from him.*/
import java.util.*;
class MaxThief{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  char[] arr=new char[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++){
    arr[i]=sc.next().charAt(0);
  }
  System.out.println("Enter k:");
  int k=sc.nextInt();
  System.out.println("Max Thiefs:"+max(arr,n,k));
 }
 public static int max(char arr[],int n,int k){
  ArrayList<Integer> p=new ArrayList<>();
  ArrayList<Integer> t=new ArrayList<>();
  for(int i=0;i<n;i++){
   if(arr[i]=='p')
    p.add(i);
   else
    t.add(i);
  }
  int i=0,j=0,ans=0;
  while(i<p.size()&&j<t.size()){
	if(Math.abs(p.get(i)-t.get(j))<=k){
	  ans++;
	  i++;
	  j++;
	}
	else if(p.get(i)<t.get(j))
	    i++;
	 else 
	   j++;
  }
  return ans;
 }
}
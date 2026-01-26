//Sliding window min substring contains 0,1,2
import java.util.*;
class SubString012{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter string:");
  String s=sc.next();
  System.out.println("length of min substring:"+find(s));
  }
  public static int find(String s){
   int arr[]=new int[3];
   int l=0,ans=0;
   int count=0;
   int minlen=Integer.MAX_VALUE;
   for(int r=0;r<s.length();r++){
     int idx=s.charAt(r)-'0';
	 if(arr[idx]==0)
	  count++;
	 arr[idx]++;
	 while(count==3){
	   minlen=Math.min(minlen,r-l+1);
	   int left=s.charAt(l)-'0';
	   arr[left]--;
	   if(arr[left]==0)
	    count--;
	   l++;
	 }
   }
   return minlen;
  }
 }
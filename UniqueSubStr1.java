//return length of longest substring that contains unique characters
import java.util.*;
public class UniqueSubStr1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.next();
	int n=s.length();
	System.out.println("Longest Substring length:"+stringUnique(s,n));
  }
  //Brute force using visited and unvisited
  public static int stringUnique(String s,int n){
    int res=0;
	for(int i=0;i<n;i++){
	   boolean f[]=new boolean[26];
	   for(int j=i;j<n;j++){
	     if(f[s.charAt(j)-'a']==true)
		  break;
		 else{
		   int len=j-i+1;
		   if(len>res)
		    res=len;
		   f[s.charAt(j)-'a']=true;
		 }
	   }
	 }
	return res;
   }
  }
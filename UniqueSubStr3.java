//return length of longest substring that contains unique characters
import java.util.*;
public class UniqueSubStr3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.next();
	int n=s.length();
	System.out.println("Longest Substring length:"+stringUnique(s,n));
  }
  //using sliding window and visited and unvisited
  public static int stringUnique(String s,int n){
    int res=0;
	int l=0,r=0;
	boolean f[]=new boolean[26];
	while(r<n){
		while(f[s.charAt(r)-'a']==true){
			f[s.charAt(l)-'a']=false;
			l++;
		}
		f[s.charAt(r)-'a']=true;
		int len=r-l+1;
		if(len>res)
			res=len;
		r++;
		
	}
	return res;
   }
  }
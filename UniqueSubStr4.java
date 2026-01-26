//return length of longest substring that contains unique characters
import java.util.*;
public class UniqueSubStr4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.next();
	int n=s.length();
	System.out.println("Longest Substring length:"+stringUnique(s,n));
  }
  //Sliding window using HashMap
  public static int stringUnique(String s,int n){
    int res=0;
	int l=0,r=0;
	HashMap<Character,Boolean> hm=new HashMap<>();
	while(r<n){
		while(hm.containsKey(s.charAt(r))){
			hm.remove(s.charAt(l));
			l++;
		}
		hm.put(s.charAt(r),true);
		int len=r-l+1;
		if(len>res)
			res=len;
		r++;
		
	}
	return res;
   }
  }
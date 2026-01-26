//return count of substring that contains unique characters
import java.util.*;
public class CountSubStr4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.next();
	int n=s.length();
	System.out.println("Count:"+stringUnique(s,n));
  }
  //Sliding window using HashMap
  public static int stringUnique(String s,int n){
    int count=0;
	int l=0,r=0;
	HashMap<Character,Boolean> hm=new HashMap<>();
	while(r<n){
		while(hm.containsKey(s.charAt(r))){
			hm.remove(s.charAt(l));
			l++;
		}
		hm.put(s.charAt(r),true);
		count+=(r-l+1);
		r++;
		
	}
	return count;
   }
  }
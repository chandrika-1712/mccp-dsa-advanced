//return count of substring that contains unique characters
import java.util.*;
public class CountSubStr2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.next();
	int n=s.length();
	System.out.println("Count:"+stringUnique(s,n));
  }
  //Brute force using HashMap
  public static int stringUnique(String s,int n){
    int count=0;
	for(int i=0;i<n;i++){
	   HashMap<Character,Boolean> hm=new HashMap<>();
	   for(int j=i;j<n;j++){
	     if(hm.containsKey(s.charAt(j)))
		  break;
		 else{
		   count++;
		   hm.put(s.charAt(j),true);
		 }
	   }
	 }
	return count;
   }
  }
//Sliding window min substring contains 0,1,2
import java.util.*;
class SubStringK{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter string:");
  String s=sc.next();
  System.out.println("Enter k:");
  int k=sc.nextInt();
  System.out.println("length of min substring:"+find(s,k));
  }
  public static int find(String s,int k){
    HashMap<Character,Integer> map=new HashMap<>();
    int left = 0;
    int minLen = 0;
    for(int right=0;right<s.length();right++){
         char c = s.charAt(right);
         map.put(c, map.getOrDefault(c, 0) + 1);
         while(map.size() == k) {
            minLen = Math.min(minLen, right - left + 1);
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            if(map.get(leftChar) == 0)
                map.remove(leftChar);
             left++;
         }
	}
   return minLen;
  }
 }
//find the word with maximum no of its anagrams
import java.util.*;
class AnagramWord{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   System.out.println(anagram(s));
  }
  static String anagram(String s){
    String arr[]=s.split(" ");
	HashMap<String,List<String>> hm=new HashMap<>();
	for(String word:arr){
	  char ch[]=word.toCharArray();
	  Arrays.sort(ch);
	  String s1=new String(ch);
	  hm.putIfAbsent(s1,new ArrayList<>());
	  hm.get(s1).add(word);
	}
	String max="";
	int count=0;
	for(List<String> l:hm.values()){
		if(count<l.size()){
			count=l.size();
			max=l.get(0);
		}
    }
	return max;
  }
 }
	
	  
	
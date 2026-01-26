//Minimum no of coins or notes to find change for v
import java.util.*;
class CoinChange{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter V:");
  int V=sc.nextInt();
  System.out.println("number of coins or notes:"+find(V));
  }
  public static int find(int v){
	int arr[]={1,2,5,10,20,50,100,200,500,2000};
	int ans=0;
	for(int i=arr.length-1;i>=0;i--){
	  if(v>=arr[i]){
	   int r=v/arr[i];
	   ans+=r;
	   v=v%arr[i];
	  }
	}
	return ans;
  }
 }
/*.Best Time to sell and buy stock:
We can choose any single day  buy only one quantity of stock and any 
future day to sell what is the maximum profit if no profit return zero.*/
import java.util.*;
class BuyAndSellStocks{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	System.out.println("Enter prices of stock:");
	int[] prices=new int[n];
    for(int i=0;i<n;i++){
     prices[i]=sc.nextInt();
   }
	System.out.println("Maximum Profit:"+findMax(prices,n));
  }
  public static int findMax(int prices[],int n)
  {
        int max=prices[n-1];
        int res=0;
        for(int i=n-2;i>=0;i--){
            if(prices[i]<max){
                int ans=max-prices[i];
                res=Math.max(ans,res);
            }
            else{
                max=prices[i];
            }
        }
        return res;
  }
 }
import java.util.*;
public class Negative1{
  public static int[] findNegative(int a[],int n,int k){
    int res[]=new int[n-k+1];
	for(int i=0;i<=n-k;i++){
	 for(int j=i;j<i+k;j++){
	   if(a[j]<0){
	    res[i]=a[j];
		break;
	   }
	 }
	}
	return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter n:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter array elements:");
	for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
	}
	System.out.print("Enter k:");
	int k=sc.nextInt();
	int res[]=findNegative(arr,n,k);
	for(int x:res){
	 System.out.print(x+" ");
	}
   }
  }
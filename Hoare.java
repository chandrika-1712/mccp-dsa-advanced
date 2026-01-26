//Hoare partition
import java.util.*;
class Hoare{
  public static void quickSort(int[] arr, int low, int high) {
        int p=0;
        if(low<high){
          p=partition(arr,low,high);
        quickSort(arr,low,p);
        quickSort(arr,p+1,high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low-1;
		int j=high+1;
        while(true){
		 do{
		  i++;
		 }while(arr[i]<pivot);
		 do{
		  j--;
		 }while(arr[j]>pivot);
		if(i>=j)
		 return j;
        swap(arr,i,j);
	  } 
    }
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
	public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size:");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("Enter elements:");
	  for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	  }
	  for(int x:arr){
	   System.out.print(x+" ");
	  }
	  quickSort(arr,0,n-1);
	  System.out.println("\nSorted order:");
	  for(int x:arr){
	   System.out.print(x+" ");
	  }
	}
}
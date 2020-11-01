import java.util.*;
public class Main
{
    public static void selectionSort(int arr[],int n)
    {
        int temp;
       for(int i=0;i<n-1;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) 
	{
	    int arr[]={24,25,22,64,65};
	    int n=arr.length;
	    selectionSort(arr,n);
	    
	}
}

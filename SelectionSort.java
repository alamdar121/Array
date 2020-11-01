import java.util.*;
public class Main
{
    public static void selectionSort(int arr[],int n)
    {
        int i,j,min_idx,temp;
        for(i=0;i<n-1;i++)
        {
            min_idx=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
        for(i=0;i<n;i++)
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

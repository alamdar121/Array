public class Main
{
    public static int kthSmallest(Integer[] arr,int n, int k) 
    { 
        if(k<=0)
        {
            return 0;
        }
        int temp;
        // Sort the given array 
        for(int i=0;i<n-1;i++)
        {   
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
 
        }
  
        // Return k'th element in 
        // the sorted array 
        return arr[k - 1]; 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 }; 
        int k = -1; 
        System.out.print("K'th smallest element is " + kthSmallest(arr,arr.length, k)); 
    } 
}

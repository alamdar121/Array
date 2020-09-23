public class MyClass {
    public static int BinarySearch(int arr[],int size,int element)
    {
        int low,mid,high;
        low=0;
        high=size-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==element)
            {
                return mid;
            }
            if(arr[mid]<element)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static int LinearSearch(int arr[],int size,int element)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
      int arr[]={20,1,5,25,6,2};
      int temp;
      int element=6;
      for(int i=0;i<arr.length-1;i++)
      {
          if(arr[i]>arr[i+1])
          {
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
              i=-1;
          }
      }
      /*for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }*/
      int result=BinarySearch(arr,arr.length,element);
      int res=LinearSearch(arr,arr.length,element);    
      System.out.println("Element Location Binary Search = " + result);
      System.out.println("Element Location Linear Search = " + res);
    }
}

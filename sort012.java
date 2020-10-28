public class Main
{
    public static void sort012(int arr[], int n)
    {
        int lo=0;
        int hi=n-1;
        int mid=0;
        int temp=0;
        while(mid<=hi)
        {
            switch(arr[mid])
            {
                case 0:
                    temp=arr[lo];
                    arr[lo]=arr[mid];
                    arr[mid]=temp;
                    mid++;
                    lo++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    break;
                
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) 
    { 
         int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
         int n=arr.length;
         sort012(arr,n);
    } 
}

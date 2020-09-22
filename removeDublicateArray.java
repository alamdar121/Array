public class MyClass {
    public static int removeDublicate(int a[],int n)
    {
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[n-1];
        for(int i=0;i<j;i++)
        {
            a[i]=temp[i];
        }
        return j;
    }
    public static void main(String args[]) {
        int arr[] = {10,20,20,30,30,40,50,50}; 
        int length=removeDublicate(arr,arr.length);
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
      
    }
}

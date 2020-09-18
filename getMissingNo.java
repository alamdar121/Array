class Main()
{
  public static int getMissingNo(int a[],int n)
  {
    int total=(n+1)*(n+2)/2;
    for(int i=0;i<n;i++)
    {
      total-=a[i];
    }
    return total;
  }
  public static void main(String args[])
  {
    int arr[]={0,1,0,1,1,0,0,0,1};
    int n=arr.length;
    int miss=getMissingNo(arr,n);
    System.out.print(miss);
   }
}

public class Main
{
    public static void reverseArray(int arr[],int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+ arr[i]);
        }
    }
	public static void main(String[] args) {
		int arr[]={2,5,9,10,15};
		reverseArray(arr,0,arr.length-1);
	}
}

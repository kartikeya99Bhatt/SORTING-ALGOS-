import java.util.*;
 class slectionSort
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }

        sort(a);
        
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");
        }
    }
    public static void  sort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                  if(arr[min]>arr[j])
                  {
                      min=j;
                  }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
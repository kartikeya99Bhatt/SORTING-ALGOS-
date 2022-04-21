import java.util.*;
class bubbleSort {
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
    public static void sort(int []arr)
    {
    
       for(int i=0;i<arr.length-1;i++)
       {
           for(int j=0;j<arr.length-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
           }
       }
    }
}

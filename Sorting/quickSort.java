import java.util.*;
public class quickSort {
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }

        QuickSort(a, 0,n-1);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    } 
  public static void QuickSort(int []arr,int lo,int hi)
  {
      if(lo>=hi)
      {
          return ;
      }
       int piviot=arr[hi];
       int idx=partision(arr, lo, hi, piviot);
       QuickSort(arr, lo, idx-1);
       QuickSort(arr,idx+1,hi);
  }
  public static int partision(int []arr,int lo,int hi,int piviot)
  {
      int i=lo;int j=lo;
      while(i<=hi)
      {
          if(arr[i]<=piviot)
          {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i++;j++;
          }
          else
          {
             i++;
          }
      }
      return j-1;
  }
}

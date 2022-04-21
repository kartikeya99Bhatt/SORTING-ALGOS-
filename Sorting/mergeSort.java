import java.util.*;
public class mergeSort {
    public static void main(String []args)
    {
       Scanner scn=new Scanner(System.in);
       int n =scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
  
        int []c=MergeSort(a,0,a.length-1);
        for(int i=0;i<c.length;i++)
        {
           System.out.print(c[i]+" ");
        }
    }
    public static int [] MergeSort(int []arr, int lo , int hi)
    {
        if(lo==hi)
        {
           int []base=new int[1];
           base[0]=arr[lo];
           return base;
        }
          int mid=(lo+hi)/2;
        int []a=MergeSort(arr, lo, mid);
        int []b=MergeSort(arr, mid+1, hi);
        int []c=mergeTwoSortedArry(a, b);
        return c;
        
    }
    public static int [] mergeTwoSortedArry(int []a,int []b)
    {
            int []c=new int[a.length+b.length];
            int i=0;int j=0;int k=0;
            while(i<a.length && j<b.length)
            {
                if(a[i]<b[j])
                { 
                    c[k]=a[i];
                    i++;k++;
                }
                else
                {
                   c[k]=b[j];
                   k++;j++;
                }
            }

            while(i<a.length)
            {
                c[k]=a[i];
                i++;k++; 
            }
            while(j<b.length)
            {
                c[k]=b[j];
                k++;j++;  
            }
            return c;
    }
}


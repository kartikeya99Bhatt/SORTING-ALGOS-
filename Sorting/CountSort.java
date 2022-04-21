import java.util.*;
public class CountSort {
  
    public static void Display(int []arr)
    {
       for(int val:arr)
       {
            System.out.print(val+" ");
       }
    }
    public static void  main(String []args)

    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        SORT(arr);
       // Display(arr);
    }
    public static void SORT(int []arr)
    {
        int max=arr[0];
        for(int val:arr)
        {
            max=Math.max(val,max);
        }
        // creaing fq
        int []fq=new int[max+1];
        Arrays.fill(fq,0);
        for(int val:arr)
        {
            fq[val]++;
        }
        // prefix sum of frequency array
        for(int i=1;i<fq.length;i++)
        {
            fq[i]=fq[i]+fq[i-1];
        }
        // give Position
        int []ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            int pos=fq[arr[i]];
            ans[pos-1]=arr[i];
            fq[arr[i]]--;
        }
        //printing
        for(int val:ans)
        {
            System.out.print(val+" ");
        }
    }
}

import java.util.*;
class selctionsort{
    public static  void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        sort s=new sort();
        s.selection_sort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class sort{
    public void selection_sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min_index]>arr[j]){
                   min_index=j;
                }
            }
             if(i!=min_index){
                    int temp=arr[i];
                    arr[i]=arr[min_index];
                    arr[min_index]=temp;
                }
        }
        return;
    }
}
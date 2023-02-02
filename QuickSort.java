package Arrays;

import java.util.Scanner;

public class QuickSort {
	
	static int partition(int a[],int start,int end)
	{
		
		 int pivot = a[end];  
		    int i = (start - 1);  
		  
		    for (int j = start; j <= end - 1; j++)  
		    {   
		        if (a[j] < pivot)  
		        {  
		            i++;   
		            int t = a[i];  
		            a[i] = a[j];  
		            a[j] = t;  
		        }  
		    }  
		    int t = a[i+1];  
		    a[i+1] = a[end];  
		    a[end] = t;  
		    return (i + 1); 
	}
	
	static void quick(int a[],int start,int end)
	{ if (start < end)  
    {  
        int p = partition(a, start, end); //p is the partitioning index  
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of ele");
		int n=sc.nextInt();
		
		 int [] a=new int[n];
		 for(int i=0;i<n;i++)
		 {
			a[i]=sc.nextInt();
		 }
		 System.out.println("before sorting");
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
		 quick(a,0,n-1);
		 
		 System.out.println("after the sort");
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

}

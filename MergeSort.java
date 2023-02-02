package Arrays;

import java.util.Scanner;

public class MergeSort {
	 static void merge(int a[], int beg, int mid, int end)    
	{    
	    
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	      
	    int []LeftArray=new int[n1];
	    int []RightArray=new int[n2];
	     
	    for (int i = 0; i < n1; i++)    
	    LeftArray[i] = a[beg + i];    
	    for (int j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	   int i = 0;  
	     int j = 0;  
	    int k = beg; 
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    

	}
	static void mergeSort(int a[], int beg, int end) {
		if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, beg, mid, end);  
	    }  
		
	}
	public static void main(String[] args)
	{
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
		 mergeSort(a,0,n-1);
		 
		 System.out.println("after the sort");
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
	}
}
	


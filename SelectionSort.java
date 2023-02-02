package Arrays;

import java.util.Scanner;

public class SelectionSort {
	static void selection(int arr[], int n)  
	{  
	    int i, j, small;  
	      
	    for (i = 0; i < n-1; i++)    
	    {  
	        small = i; 
	          
	        for (j = i+1; j < n; j++)  
	        if (arr[j] < arr[small])  
	            small = j;  
	
	    int temp = arr[small];  
	    arr[small] = arr[i];  
	    arr[i] = temp;  
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
		 selection(a,n);
		 
		 System.out.println("after the sort");
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

}

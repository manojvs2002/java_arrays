package Arrays;

import java.util.Scanner;

public class BinarySearch {

		 static int binarySearch(int a[], int beg, int end, int val)    
		{    
		    int mid = 0;    
		    if(end >= beg)     
		    {        mid = (beg + end)/2;    
		 
		        if(a[mid] == val)    
		        {                 
		            return mid+1;    
		        }    
		              
		        else if(a[mid] < val)     
		        {  
		            return binarySearch(a, mid+1, end, val);    
		        }    
		              
		        else     
		        {  
		            return binarySearch(a, beg, mid-1, val);    
		        }          
		    }
			return mid;    

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
				 
				 System.out.print("enetr the ele to be searched");
				 int ele=sc.nextInt();
				 
				int res= binarySearch(a, 0, n-1, ele);
				 if (res == -1)  
					  System.out.println("\nElement is not present in the array");  
					  else  
						  System.out.println("\nElement is present at %d position of array"+ res);  
					    return;
		 }

}

package Arrays;

import java.util.Scanner;

public class Subset {
	
	
	static int isSubset(int a[], int b[], int m, int n)
			{
				int i = 0;
				int j = 0;
				for (i = 0; i < n; i++)
				{
					for (j = 0; j < m; j++)
					{
					if (a[i] == b[j])
					    break;
					
					
					if (j == m)
					return 0;
					}
				}
				
				
				return 1;
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of ele in 1st array");
		int m=sc.nextInt();
		System.out.println("enter the num of ele in 2nd array");
		int n=sc.nextInt();
		
		 int [] a=new int[m];
		 System.out.println("enter the  ele in 1st array");
		 for(int i=0;i<m;i++)
		 {
			a[i]=sc.nextInt();
		 }
		 int [] b=new int[n];
		 System.out.println("enter the  ele in 2nd array");
		 for(int i=0;i<n;i++)
		 {
			b[i]=sc.nextInt();
		 }
		 if (isSubset(a, b, m, n)==1)
	            System.out.print("b is "+ "subset of a ");
	        else
	            System.out.print("b is "+ "not a subset of a]");
			

	}

}

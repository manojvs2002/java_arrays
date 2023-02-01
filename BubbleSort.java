package Arrays;
import java.util.*;

public class BubbleSort {
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
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 System.out.println("after the sort");
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
	}


}

package Arrays;
import java.util.*;

public class Duplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr the no of ele into array");
		int n=sc.nextInt();
		
		int [] a = new int[n] ;
		System.out.println("enter ele into the array");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int i,j;
		System.out.println("duplicate nos are");
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]);
				}
			}
		}
		
			
		
		
		
	

	}
}

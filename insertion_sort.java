package practice;
import java.util.Scanner;
public class insertion_sort {
	public static void sort(int a[],int n)
	{
		int c=0,s=0;
		for(int i=1;i<n;i++)
		{
			int t=a[i];
			int j=i-1;
			while(j>=0 && a[j]>t)
			{
				a[j+1]=a[j];
				c++;
				s++;
				j=j-1;
			}
			a[j+1]=t;
			s++;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("comparisons = "+c);
		System.out.println("Shifts =  "+s);
	}
	public static void main(String agr[])
	{
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n;
			n=in.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=in.nextInt();
			sort(a,n);
		}
	}

}

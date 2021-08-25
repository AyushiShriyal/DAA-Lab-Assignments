package practice;

import java.util.Scanner;

public class equivalentDifference {
	public static int Count(int a[],int n,int key)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(a[i]-a[j])==key)
					count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		int d;
		Scanner in = new Scanner(System.in);
		d=in.nextInt();
		for(int i=0;i<d;i++)
		{
			int n=in.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=in.nextInt();
	        int key = in.nextInt();
			System.out.println(Count(a,n,key));
				
		}
	}

}
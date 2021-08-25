package practice;

import java.util.Scanner;

public class threeIndices {
	public static void Search(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]==a[k])
					{
						System.out.println((i+1)+" "+(j+1)+" "+(1+k));
						return;
					}
				}
			}
		}
		System.out.println("No sequence found ");
		
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
	
			Search(a,n);
				
		}
	}

}

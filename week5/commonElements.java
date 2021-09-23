package practice;
import java.util.Scanner;
public class commonElements {
	static void print_common(int a[],int b[],int n,int m)
	{
		int i=0,j=0;
		while(i<n&&j<m)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			else if(a[i]>b[j])
				j++;
			else
				i++;
		}
	}
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int m=in.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
			b[i]=in.nextInt();
		print_common(a,b,n,m);
	}
}

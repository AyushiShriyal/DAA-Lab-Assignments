package practice;

import java.util.Scanner;
public class duplicateKeyElement {
	
	public static int Search(int a[],int n,int k)
	{
		int l=0,h=n-1,m,count=0,d=0;
		while(l<=h)
		{
			m=l+((h-l)/2);
			if(a[m]==k)
			{
			if((m==n-1 || a[m+1]>k))
			{
				h = m-1;
				count+=m;
				d++;
			}
			if(m==0 || a[m-1]<k)
			{
				l=m+1;
				count-=m;
				d++;
			}
			else 
				l=l+1;
			if(d==2)
				return count+1;
			}
			else
			{
				if(a[m]>k)
					h=m-1;
				else
					l=m+1;
			}
		}
		return count;
	}
	public static void main(String arg[])
	{
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=in.nextInt();
			int k=in.nextInt();
			if(Search(a,n,k)<=0)
				System.out.println("Key is not present");
			else
				System.out.println(k+"-"+Search(a,n,k));
		}
	}

}

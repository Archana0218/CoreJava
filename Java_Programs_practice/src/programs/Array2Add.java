package javaprograms;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2Add
{
	public static void main(String arg[]) throws Exception
	{
		int a[]= new int[5];
		int b[]= new int[5];
		int c[]= new int[10];
		int i;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nEnter 1st Array element:");
		for (i=0;i<5;i++)
		{
					a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("\nEnter 2nd array element:");
		for(i=0;i<5;i++)
		{
		      b[i]=Integer.parseInt(br.readLine());
		
		}
		
		for(i=0;i<10;i++)
		{
		      c[i]=a[i]+b[i];
		     		
		System.out.println("\nAddition of array is  "+c[i]);
		}
	}
}

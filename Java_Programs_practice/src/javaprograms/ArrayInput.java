package javaprograms;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayInput 
{
public static void main(String arg[]) throws Exception

{
		int a[]=new int[5];
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 5 element:");
		for (i=0;i<5;i++)
			a[i]=Integer.parseInt(br.readLine());
			System.out.println("Entered array element are:");
			for(i=0;i<5;i++)
				System.out.println(""+a[i]);
		}		
}

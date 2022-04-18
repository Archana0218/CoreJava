package javaprograms;

import java.util.Scanner;

public class PerfectNo {
	public static void main(String ar[]) throws Exception
	{
		int i=1,sum=0,count=0;
		Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no1=Sc.nextInt();
        while(i<=no1)
        {
        	if(no1%i==0)
        	{
        		System.out.println("\n is factor="+i);
        		count++;
        		sum=sum+i;
          	}
        	i++;
        }
        Sc.close();
		System.out.println("\nFound no="+count);
		System.out.println("\nSum of fact="+sum);
	}

}

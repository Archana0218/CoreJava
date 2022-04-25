package javaprograms;


public class StarPattern
{
	public static void main(String arg[]) 
	{
		int c,r;
		for(r=1; r<=5; r++)
		{
			for(c=1; c<=r; c++) 
			{
				System.out.print("*"+r);
			}
			System.out.print("\n");
		}
	}
	

}


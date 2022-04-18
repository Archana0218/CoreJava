package javaprograms;

/*whenever we can pass object reference to the constructor the it is copy constructor */
public class Copy_const
{
	
	int a;
	String b;
	Copy_const()
	{
		a=100; b="Archana";
		System.out.println(a+""+b);
	}
	
	Copy_const(Copy_const reff)
	{
		a=reff.a;
		b=reff.b;
		System.out.println(a+""+b);
	}
	
	public static void main(String[] args) 
	{
		Copy_const cc=new Copy_const();
	
		new Copy_const(cc);
		

	}

}
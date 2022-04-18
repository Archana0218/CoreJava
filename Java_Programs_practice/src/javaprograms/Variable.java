package javaprograms;

public class Variable 
{
	int b=20;//instance variable
	
	static int c=30; //Static variable
	public static void main(String[] args) 
	{
		
		int a=10;//local variable
		System.out.println(a);
		
		Variable V=new Variable(); //instance variable print
		System.out.println(V.b);
		
		System.out.println(Variable.c);//Static variable print

	}
	

}

/*local variable are declared with the method its access on body of the method */
/*instance variable are declared within the class and outside the method its called by object for print */
/*Static variable are declared with in the class its directly called by the object reference */
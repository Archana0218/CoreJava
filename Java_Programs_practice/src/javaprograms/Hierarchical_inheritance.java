package javaprograms;


/*Hierarchical inheritance contain only one superclass and multiple subclass*/

public class Hierarchical_inheritance 
{
	void input()
	{
		System.out.println("Enter your name:");
	}
	public static void main(String[] args) 
	{
			AI o1=new AI();
			o1.input();
			o1.show();
			IA o2=new IA();
			o2.input();
			o2.disp();
	}
}
class AI extends Hierarchical_inheritance
{
	void show()
	{
		System.out.println("My name is Archana");
	}
}

class IA extends Hierarchical_inheritance
{
	void disp() 
	{
		System.out.println("I'm Prisha");
	}
}




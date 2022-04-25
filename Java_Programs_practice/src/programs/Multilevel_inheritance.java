package javaprograms;

/*multilevel inheritance contain one super class and multiple subclass */
public class Multilevel_inheritance 
{

	public static void main(String[] args) 
	{
		B ML= new B();
		ML.add();
		ML.sub();
		ML.mul();
		ML.div();
		ML.mod();

	}
	int a,b,c;
	void add()
	{
		a=2;b=31;
		c=a+b;
		System.out.println("Addition of two number:" +c);
		
	}
	void sub()
	{
		a=2;b=31;
		c=a-b;;
		System.out.println("Substracation of two number:" +c);
	}
}
class A extends Multilevel_inheritance
{
	void mul()
	{
		a=2;b=31;
		c=a*b;
		System.out.println("Multiplication of two number: "+c);
	}
	void div()
	{
		a=31;b=2
				;
		c=a/b;
		System.out.println("division of two number: "+c);
	}
}
class B extends A
{
	void mod()
	{
		a=2;b=31;
		c=a%b;
		System.out.println("mod of two number: "+c);
	}

}
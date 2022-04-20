package javaprograms;
/* polymorphism is a Greek word whose meaning is some object having different behavior
 * TYpe of poly 1. compile time or static or early binding:-
 * 						which is exist at the time of compilation is compile it achieve by method overloading whenever
 * 						 class contain one method with same name and different type of parameter its method overloading
 * 				2. runtime or dynamic or let binding:-
 * 						which exist at the time of execution program is its role play by jvm it achieve by method overriding 
 * 						whenever in super and sub class method in such a way that method name and parameter must be same 
 * */

public class Polymorhism {
		
	
	void method_overloading()
	{
		int add;
		int a=2,b=31;
		add=a+b;
		System.out.println("1st Addition:"+add);
	}
	void method_overloading(int x, int y)
	{
		int add1 = x+y;
		System.out.println("2nd Addition is "+add1);
	}
	
	void method_overloading(int c, double v)
	{
		double add2=c+v;
		System.out.println("3rd addition is:" +add2);
	}

	/*method overridding */
class A
	{
	void disp()
	{
		System.out.println("A is sub class overload");
	}
	}
class I extends A
{
	void disp()
	{
		System.out.println("I is extend by A ");
	}
}
public static void main(String[] args) 
{
	Polymorhism poly=new Polymorhism();
	poly.method_overloading();
	poly.method_overloading(12,2);
	poly.method_overloading(18, 23.18);
	I m=new A();
	m.disp();
}

}

package javaprograms;
/*In parameterized constructor we pass one or more parameter*/
 
public class Parameterized_constructor {
	
	int x;
	int y;
	String c;
	Parameterized_constructor(int a, int b)
	{
		x=a;
		y=b;
	}
	Parameterized_constructor(int a, String b)
	{
		x=a;c=b;
		System.out.println(x+" "+c);
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
	

	public static void main(String[] args) {
		Parameterized_constructor pc=new Parameterized_constructor(100, 200);
		pc.show();
		new Parameterized_constructor(2,"Archana");
	}

}

package javaprograms;
/*Inheritance when we construct new class from existing class 
or one class access all the features and properties of existing class */

/*single inheritance is having only one super class and one base class*/
public class Single_Inheritance 
{
	public static void main(String args[]) 
	{
		Stud si=new Stud();
		si.Input();
		si.display();
	}
	int rn,marks;
	String name;
	void Input()
	{
		System.out.println("Student Roll_no Name and Marks:");
	}
}

	class Stud extends Single_Inheritance
	{
		void display() 
		{
		int rn=2;
		String name="Archana";
		int marks=81; 
		System.out.println(+rn+" "+name+" "+marks);
		}
		
}
	
	


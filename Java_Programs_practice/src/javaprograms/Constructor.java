package javaprograms;

/* constructor is a special function is same as the class name. its does not return any argument
 * its is also called as default constructor*/
public class Constructor 
{
	
	int A;//instance variable //Default constructor
	
	
	String Name;
	
	Constructor()// Constructor is Same as the Class
	
	{
		A=2; Name="Archana";
	}
	void show()
	{
		System.out.println(A+" "+Name);
	}

public static void main(String[] args) 
{
		
	Constructor c=new Constructor();
     c.show();

}
}

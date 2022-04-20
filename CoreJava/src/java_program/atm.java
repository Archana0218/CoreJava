package java_program;

public class atm //base class

{
	int amt_withdraw=2000;

}
	public class atm extends withdraw// subclass
	{
		int amt_left=5000;
		
	
	public static void main(String[] args) 
	{
	atm ob=new atm();
	
		System.out.println("amount wihtdraw" + ob.amt_withdraw);
		System.out.println("amount left" +ob.amt_left);

	}

}

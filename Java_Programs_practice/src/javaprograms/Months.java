package javaprograms;

public class Months {
	enum MONTH {Jan = 0, Feb, Mar};
	   
	public static void main(String[] args) {
		
		enum MONTH month = Mar;

		   
		   if(month == 0)
		   System.out.println("Value of Jan");
		   else if(month == 1)
		   System.out.println("Month is Feb");
		   if(month == 2)
		   System.out.println("Month is Mar");
		

	}

}

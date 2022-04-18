package javaprograms;

import java.util.Scanner;

public class Arrayofobjectstud 
{
	
		int sno;
		int fees;
		int snm,cls;
		Scanner Sc=new Scanner(System.in);
		
			
			void accept() throws Exception
			{
				System.out.println("Enter Student RollNo:");
				sno=Sc.nextInt();
	
				System.out.println("Enter Student name:");
			     snm=Sc.nextInt();
			     
		
				System.out.println("Enter Student cls :");
				cls=Sc.nextInt();
				
				fees=Sc.nextInt();
				System.out.println("Enter student fees:");
			}
			void disp()
			{
				System.out.println("Student Roll No is"+sno);
				System.out.println("Student name is" +snm);
				System.out.println("Student cls is" +cls);
				System.out.println("Student fees is" +fees);
			}
			
			public static void main(String arg[]) throws Exception
			{
				Arrayofobjectstud stud[]=new Arrayofobjectstud [3];
				int i;
				
				for (i=0; i<3; i++)
				{
					stud[i]=new Arrayofobjectstud();
					stud[i].accept();
				}
				for(i=0; i<3; i++)
				{
					stud[i].disp();
				}
				
			}

		
				

}

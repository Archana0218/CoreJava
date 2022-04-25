package javaprograms;


public class ArrayOfObject {
	public static void main(String arg[])
	{
		//this is normal
		a1 a2=new a1();
		a2.a=10;
		System.out.println(a2.a1);
		a1 a21=new a1();
		a21.a=20;
		System.out.println(a21.a1);
		a1 a3=new a1();
		a3.a=30;
		System.out.println(a3.a);
		System.out.println(a2.a+a21.a+a3.a);		
		//Now Array Object
		a1 aa[]=new a1[5];
		//array size declaration
		for (int i=0;i<aa.length;i++)
		{
			aa[i]=new a1();//every object memory allocation
		}
		for(int i=0; i<aa.length;i++)
		{
			aa[i].a=i+100;//value initial
			System.out.println(aa[i].a);//value retrieve
			
		}
		}

}
class a1
{
	
	public char[] a1;
	int a;
}

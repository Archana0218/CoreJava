package javaprograms;


import java.io.DataInputStream;

public class DataIntput {
	public static void main() throws Exception
	{
		int a,b, c;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 2 number:");
		
		a=Integer.parseInt(d.readUTF());
		b=Integer.parseInt(d.readUTF());
		c=a+b;
		System.out.println("Addition is "+c);
	}

}

package javaprograms;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bufferedadd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter 2 number:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("\n Addition of two no "+c);
	}

}

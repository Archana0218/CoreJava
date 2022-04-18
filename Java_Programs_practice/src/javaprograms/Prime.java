package javaprograms;

import java.util.Scanner;

public class Prime {
		public static void main(String args[]) 
	    {
		int num,i,count; 
	    Scanner s=new Scanner(System.in); 
	   
	    System.out.println("Enter A Number"); 
	    num =s.nextInt(); 
	    i=1; 
	    count=0; 
	     while(i<= num) 
	        { 
	            if((num%i)==0) 
	               count=count+1; 
	               i++; 
	        }  	
	     if(count==2) 
	             System.out.println(num +" is a prime number"); 
	     else 
	             System.out.println(num +" is not a prime number"); 
	     s.close();
	    }
		
	}



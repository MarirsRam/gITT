package pratices;


import java.util.Scanner;

public class UserTest2 
	{
public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a;
	int b;
	int c;
	
	System.out.println("first num of - ");
	 a=s.nextInt();
	System.out.println("second num of-  ");
	b=s.nextInt();
	System.out.println("third num of-  ");
	c=s.nextInt();
    //a=s.nextInt();
	//b=s.nextInt();
	//c=s.nextInt();
   if((a>b) & (a>c)){
	   
   
	System.out.println("big num is-"+a );   
   }
   else if((b>c) & (b>a))
   {
	   System.out.println("big num is-"+b);
   }
   
  else 
   System.out.println("big num is-"+c);
}	   
	   
}   
	   








	
	

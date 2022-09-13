package pratices;

import java.util.Scanner;

public class UserTest4 {
public static void main(String[] args) {
	
	Scanner f=new Scanner (System.in);
	 
	
	System.out.println("enter the first num - a");
	int a = f.nextInt();
	System.out.println("enter the second num - b ");
	int b= f.nextInt();
	System.out.println("enter the third num - c");
	int c= f.nextInt();
	System.out.println("enter the fourth num - d");
	int d = f.nextInt();
	
	if(a<b && b<c && c<d) {
		System.out.println("increscesing order");
	}
	else if(a>b && b>c&&c>d) {
		System.out.println("decressing order");
	}
	else {
		System.out.println("random order");
	}
	
	
}
}







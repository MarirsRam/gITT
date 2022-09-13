package pratices_2;

import java.util.Scanner;

public class A2_FindLeapYear {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the num of month-");
	 int i=scan.nextInt();
	 if(i==1|i==3|i==5|i==7|i==8|i==10|i==12) {
	System.out.println("momth"+i+"has 31 days");
	 }
	 else if (i==2) {
		 System.out.println("month 2 has 28 days or 29 days if it is leap year");
	 }
	 else if (i==4|i==6|i==9|i==11) {
		 System.out.println("month"+i+"has 30 days");
	 }
	 else {
		 
		 System.out.println("input out of range");
		 
		 
		 
		 
		 
		 
	 }
}
}

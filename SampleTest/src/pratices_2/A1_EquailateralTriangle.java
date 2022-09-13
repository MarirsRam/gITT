package pratices_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1_EquailateralTriangle {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("Give the value of A");
	double a=s.nextDouble();
	
	Double value=(1.7320*(a*a))/4;       // A= 3--1.7320, 1/4--0.25
	System.out.println("my value"+ value);
	
	//double sqthree =Math.pow(3,0.5);
	
	//DecimalFormat re = new DecimalFormat();
	//re.setMaximumFractionDigits(2);
	//double result=(((sqthree)*a*a*0.25));
	//System.out.println((re.format(result)));
	
	
	
}
}

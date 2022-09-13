package pratices_6;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementsAnArray {

	public static void main(String[] args) {
		System.out.println("required size of Array");
		Scanner ele=new Scanner(System.in);
		int size= ele.nextInt();
		int Array[]= new int [size];
		int sum=0;
		System.out.println("element Array one by one");
		
		for (int i=0;i<size;i++){
			Array[i]=ele.nextInt();
			sum=sum + Array[i];	
		}
		System.out.println("Element of Array:"+Arrays.toString(Array));
		System.out.println("sum of array:"+sum);
		
	}
}

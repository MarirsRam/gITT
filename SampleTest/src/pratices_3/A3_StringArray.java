package pratices_3;

import java.util.Arrays;

public class A3_StringArray {
public static void main(String[] args) {
	String[] a= new String[] {"Welcome","To","java"};
	System.out.println("before");
	for(int i=0;i<a.length;i++) {
	System.out.print(" "+a[i]);
	}
	System.out.println();
	
 System.out.println(" after ");
 
	Arrays.sort(a);
	for (int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
}
}

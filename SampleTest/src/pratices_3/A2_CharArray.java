package pratices_3;

import java.util.Arrays;

public class A2_CharArray {
public static void main(String[] args) {
	char[] a=new char[4];
	
	a[0]='a';
	a[1]='b';
	a[2]='c';
	a[3]='d';
	
	System.out.println(a[2]);
	for(int i=0;i<a.length;i++) {
		System.out.println();
	}
	
	Arrays.sort(a);
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
}
}

package pratices_3;

import java.util.Arrays;

public class A1_ArrayTest {
public static void main(String[] args) {
	
	int[] a=new int[4];
	a[0]=7;
	a[1]=6;
	a[2]=5;
	a[3]=4;
	System.out.println("before sort");
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]+" ");
}
  Arrays.sort(a);
  System.out.println("after sort");
  for(int i=0;i<a.length;i++) {
  System.out.println(a[i]+" ");

  }
   System.out.println();
   System.out.println("small="+a[0]);
   System.out.println("large="+a[a.length-1]);
   System.out.println();
   
   
   
   
}
}

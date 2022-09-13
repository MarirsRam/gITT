package pratices_3;

public class A4_2DArraysAndComparison {
public static void main(String[] args) {
	int a[][] =new int[][] {{1,2},{3,4},{5,6}};
	int b[][] =a;
	int c[][] =new int[][] {{1,2},{3,4},{5,6}};
	int d[][] =new int[][] {{5,6},{4,3},{2,1}};
	
	System.out.println(a==b);
	System.out.println(c==d);
	System.out.println(c==a);
}
}

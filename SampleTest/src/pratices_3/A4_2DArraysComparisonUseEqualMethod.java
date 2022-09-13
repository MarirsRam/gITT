package pratices_3;

import java.util.Arrays;

public class A4_2DArraysComparisonUseEqualMethod {
public static void main(String[] args) {
	int a[][] =new int[][] {{1,2},{3,4},{5,6}};
	int b[][] =a;
	int c[][] =new int[][] {{1,2},{3,4},{5,6}};
	int d[][] =new int[][] {{5,6},{4,3},{2,1}};
	
	//System.out.println();
	if(Arrays.deepEquals(a, c)) {          // .deepequal---arrays value cheak(1,2,3,4 ) 
		System.out.println("a and c same");// .equal---- 0,1,2,3 Cheak pannum
	}
	
}
}

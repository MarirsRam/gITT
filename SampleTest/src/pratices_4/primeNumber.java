package pratices_4;

import java.util.Scanner;

import javax.swing.plaf.basic.DefaultMenuLayout;

public class primeNumber {
	public static int[] getmethod(String data){
	int xlimit[]={1,2,3,4,5};
	int yLimit[]={6,7,8,9,10};
	int limit[]={0,0,0,0,0};
	switch(data){
	case "hello":
		limit=xlimit;
		break;
	case "world":
		limit=yLimit;
		break;
		
	
	default :
		return limit;
	}
	return limit;
	}
 public static void main(String[] args) {
	
//	 Scanner sc=new Scanner (System.in);
//	 System.out.println("print the value");
//	 int n= sc.nextInt();
	 int count='0';
	 
	 for(int i=2;i<10;i++){
		
		 count=0;
		 for(int j=i;j>=1;j--){	
			 
			 if(i%j==0){
				 
				 count++;
			 }
				 
				 
			 }
		 
		 if(count==2){
			 System.out.println(i);
		 }
	 }
}
}

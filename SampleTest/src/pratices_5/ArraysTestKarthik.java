package pratices_5;

public class ArraysTestKarthik {

public static int []login(String data){
	int[] limitx={1,2,3,4,5};
//		int a1[]=1;
//		int a2[]=2;
//		int a3[]=3;
//		int a4[]=4;
		//int a5[]=5;
		//int limit x[]={a1,a2,a3,a4,a5}
		
//		int a6[]=6;
//		int a7[]=7;
//		int a8[]=8;
//		int a9[]=9;
//		int a10[]=10;
		int limity[]={6,7,8,9,10};
			
		int limit[]={0,0,0,0,0};
		
		switch (data) {
		case "hello" :
		//
			limit=limitx;
		break;
		case "world":
		limit=limity;	
			break;
	}
		return limit;
}
public static void main(String[] args) {
	String value="hello+world";
	String[]split=value.split("(\\+)");// \\+-------- 
	for(int i=0;i<split.length;i++){
		System.out.println(split[i]);
	int var[]=login(split[i]);
	for(int j=0;j<var.length;j++){
		System.out.println(var[j]);
	}
	}
}
}

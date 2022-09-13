package pratices_4;

public class sbs {
public static void main(String[] args) {
	String a= "sriram"; // String pool is immutable it will not add or delete - immutable - it will not change memory 
	a.concat("saranathan");
	System.out.println(a);
	
	StringBuffer sb = new StringBuffer("sriram") ;//mutable - it will change memory
	sb.append(" saranathan");
	System.out.println(sb);
	
	StringBuilder sb1= new StringBuilder("sriram");
	sb1.append(" saranathan");
	sb1.append(" mayavaram");
}
}

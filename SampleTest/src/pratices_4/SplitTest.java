package pratices_4;

public class SplitTest {
public static void main(String[] args) {
	String s= "this is java program";
	
	String[]a=s.split(" ");
	for(String b:a){
		System.out.println(b);
	}
	System.out.println(a[2]);
}
}

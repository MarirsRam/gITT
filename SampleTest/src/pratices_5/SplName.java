package pratices_5;

public class SplName {

	public static void main(String[] args) {
		String a= "@192.168.56.11 root / helloARI";
		String alp=a.replaceAll("[^A-Z]","");
		String alp1=a.replaceAll("[^a-z]","");
		String num=a.replaceAll("[^(0-9)]","");
		String spl=a.replaceAll("[A-Z a-z 0-9]","");
		
		 
		
		
		System.out.println(alp);
		System.out.println(alp1);
		System.out.println(num);
		System.out.println(spl);
		
	}
	
}

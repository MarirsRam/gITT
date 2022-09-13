package pratices_4;

public class RegularExpressionTest {

	public static void main(String[] args) {
		
		
		String s = "Test288#7En$4@GINEER";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s.length();i++){
			
			if(Character.isDigit(s.charAt(i))){
				
				sb.append(s.charAt(i));
				
				//System.out.println(sb);
			}
			
			//System.out.println(sb);
		}
		System.out.println(sb);
		
	}
	
}

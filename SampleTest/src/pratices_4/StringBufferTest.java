package pratices_4;

public class StringBufferTest {

	public static void main(String[] args) {
		
	long l =	System.currentTimeMillis();
	StringBuffer sb=new StringBuffer("vcentry");
	 
	for(int i=0;i<=10;i++){
		sb.append("tech");
		System.out.println("time taken stringbuffer:"+(System.currentTimeMillis()-l));
	}
	}
}

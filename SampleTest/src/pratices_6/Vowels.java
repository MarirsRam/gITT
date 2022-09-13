package pratices_6;

public class Vowels {
public static void main(String[] args) {
	String a="sriram";
	//String a =" @192.168.56.11. root / hello";
   	//int vowels=0;
	int Consonants=0;
	//int digit=0;
	//int spl=0;
	//int space=0;
	
	for(int i=0;i<a.length();i++){
		//if(a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='e'){
		//	vowels++;	
	//	}
		if(Character.isJavaIdentifierStart(a.charAt(i)) && a.charAt(i)!='e' && a.charAt(i)!='o'){
		System.out.println(a.charAt(i));
		 Consonants++;
	}
     //   if(Character.isDigit(a.charAt(i))){
	  //   digit++;
	
    //    }	
     //   if(Character.isWhitespace(a.charAt(i))){
       // 	space++;
    //    }
      //  if(!Character.isJavaIdentifierPart(a.charAt(i))&&!Character.isWhitespace(a.charAt(i))){
        //	spl++;
    //    } 
	//}
//System.out.print(in);

//String a =" @192.168.56.11. root / hello";
//
//System.out.println(vowels+"--- vowels");
System.out.println( Consonants+"--- Conso");
//System.out.println( digit+"--- digit");
//System.out.println(space+"--- space" );
//System.out.println(spl+"---spl");
//
//	}

}
}
}
package practiceQue_17Dec;

public class que4 {

	public static void main(String[] args) {
		
		String str="Computer Application";
		String res="";
		for(int i=0;i<str.length();i++) {
			
			char x=str.charAt(i);
			if( x!='a' && x!='e' && x!='i' && x!='o' && x!='u') {
				
				res=res+x;				
			}
			
		}
		
		System.out.println("String:"+str);
		System.out.print("Result:"+res);

	}

}

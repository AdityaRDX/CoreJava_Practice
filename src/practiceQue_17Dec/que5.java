package practiceQue_17Dec;

import java.util.Scanner;


public class que5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String res ="";
		int vow =0;
		
		for(int i=0 ; i<s.length();i++)
		{
			char c = s.charAt(i);
			if('a'==c || 'A' == c || 'e'==c || 'E' == c || 'i'==c || 'I' == c || 'o'==c || 'O' == c || 'u'==c || 'U'==c || ' '==c )
			{
	
				vow++;
			}
			else
			{
				res = res + c;
			}
		}
		
		
		System.out.println("String Without vowels : "+ res);
		
		System.out.println("Count without vowel  : "+ (s.length() - vow));
		
		

	}

}

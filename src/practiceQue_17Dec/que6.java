package practiceQue_17Dec;

import java.util.Scanner;

public class que6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		str = str.trim();
		str = ' '+str;
		char x;
		for(int i =0;i< str.length();i++) {
			x = str.charAt(i);
			if(x==' ') {
				System.out.println(str.charAt(i+1)+" ");
			}
		}
	}

}

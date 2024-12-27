package practiceQue_17Dec;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter 1st character:");
		ch = sc.next().charAt(0);
		if(Character.isAlphabetic(ch)) {
			System.out.println("It is character");
			if(Character.isUpperCase(ch)) {
				System.out.println("UpperCase char");
			}
			else if(Character.isLowerCase(ch)) {
				System.out.println("LowerCase char");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Digit");

		}
		else {
			System.out.println("Special char");

		}

	}

}

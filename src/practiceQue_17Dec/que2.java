package practiceQue_17Dec;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter 1st character:");
		ch = sc.next().charAt(0);
		if(ch == 'z') {
			System.out.println("follows a");
		}
		else if(ch == 'Z') {
			System.out.println("follows A");
		}
		else {
			System.out.println("follows "+(++ch));
		}
	}

}

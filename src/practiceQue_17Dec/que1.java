package practiceQue_17Dec;

import java.util.*;

public class que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1,ch2;
		System.out.println("Enter 1st character:");
		ch1 = sc.next().charAt(0);
		System.out.println("Enter 2nd character:");
		ch2 = sc.next().charAt(0);
		int n1 = (int)ch1;
		int n2 = (int)ch2;
		int sum = n1+n2;
		int diff = n1-n2;
		System.out.println("Sum of ASCII value is:"+sum);
		System.out.println("Difference of ASCII value is:"+diff);
	}

}

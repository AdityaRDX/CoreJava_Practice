

import java.util.Scanner;

public class Prime {
	
	public static int primeCheck(int n) {
		
		int isPrime = 0, count = 2;
		
		while(count <= n/2) {
			if(n%count==0) {
				isPrime++;
				break;
			}
			count++;
		}
		if(isPrime==0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		if(primeCheck(n)==1) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
	}

}

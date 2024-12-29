package Recursion;

public class Factorial {
	
	public static int calculateFact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		
		int fact_n1 = calculateFact(n-1);
		int fact_n = n * fact_n1;
		return fact_n;
	}
	
	public static void main(String[] args) {
		
		int n = 7;
		int fact =calculateFact(n);
		System.out.println(fact);
	}

}

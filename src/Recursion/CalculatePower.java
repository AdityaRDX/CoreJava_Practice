package Recursion;

public class CalculatePower {

	public static int calPower(int x, int n) {
		if(n==0) {
			return 1;
		}
		else if(x==0) {
			return 0;
		}
		int pow_n1 = calPower(x, n-1);
		int pow = x * pow_n1;
		return pow;
	}
	
	public static void main(String[] args) {
		
		int x = 2, n =5;
		int pow = calPower(x, n);
		System.out.println(pow);
	}

}

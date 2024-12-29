package Recursion;

public class SumOfNumbers {
	
	public static void sumOfNumbers(int i, int n,int sum) {
		if(i == n) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		
		sum+= i;
		sumOfNumbers(i+1, n, sum);
	}

	public static void main(String[] args) {
		
		System.out.print("Sum of n natural numbers is: ");
		sumOfNumbers(1, 5, 0);

	}

}

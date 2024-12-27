import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		int sum =0,i=1;
		
		while(i<=num/2) {
			
			if(num%i == 0) {
				sum = sum+ i;
			}
			i++;
		}
		if(sum == num) {
			System.out.println(num+" is Perfect number");
		}
		else {
			System.out.println(num+" is not Perfect number");
		}
	}

}

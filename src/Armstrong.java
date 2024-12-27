
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		isArmstrong(num);
	}
	
	static void isArmstrong(int n) {
		int digit=0, temp = n;
		
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		System.out.println("Count :"+digit);
		
		int sum = 0,lastNum;
		temp = n;
		while(temp>0) {
			lastNum = temp%10;
			sum = (int) (sum + Math.pow(lastNum, digit)); 
			temp/=10;
		}
		
		if(sum == n) {
			System.out.println(n+" is armstrong");
		}
		else {
			System.out.println(n+" is not armstrong");
		}
	}
}

package ArrayPractice;

import java.util.*;

public class SecondHighestElement {

	public static void main(String[] args) {
		
		int n,max1,max2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array:");

		for(int i=0; i< n ;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Given array is:");
		
		for(int i=0; i< n ;i++) {
			System.out.print(arr[i]+" ");
		}
		
		if(arr[0]>arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		}
		else {
			max2 = arr[0];
			max1 = arr[1];
		}
		
		for(int i =2; i<n; i++) {
			if(arr[i]> max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]>max2){
				max2 = arr[i];
			}
		}
		
		System.out.println("\nSecond highest element in array is: "+ max2);
	}

}

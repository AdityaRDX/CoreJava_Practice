package ArrayPractice;
import java.util.Arrays;

public class BinarySearch {
	
	public static int[] arraySort(int arr[]) {
		int temp =0;
		for(int i=0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr;
	}
	
	public static int binarySearch(int arr[],int target) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]< target) {
				left = mid +1;
			}
			else {
				right = mid -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {9,11,5,13,7};
		
		int[] sortedArr = arraySort(arr);
		System.out.println("Sorted array: "+Arrays.toString(sortedArr));
		
		int result = binarySearch(sortedArr,11);
		if(result!= -1) {
			System.out.println("Element found at index: " +result);
		}
		else {
			System.out.println("Element not found");
		}
	}

}

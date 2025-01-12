package ArrayPractice;

public class RotateArray {

	public static void reverse(int arr[],int s, int e ) {
		
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		int k = 2;
		int start = arr[0];
		int end = arr[arr.length-1];
		
		k = k%arr.length;
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}

package ArrayPractice;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,2,3,4,4,5,6,6,6};
		int j = 0;
		int temp[] = new int[arr.length];
		for(int i = 0; i< arr.length-1 ; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		
		for(int i = 0; i<j; i++) {
			System.out.println(temp[i]);
		}
	}

}

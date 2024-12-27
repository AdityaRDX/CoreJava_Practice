package StringPractice;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] arr = {"flower","fly","fleet"};
		StringBuffer result = new StringBuffer();
		Arrays.sort(arr);
		
		char[] first = arr[0].toCharArray();
		char[] last = arr[arr.length-1].toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(first[i] != last[i]) {
				break;
			}
			result.append(first[i]);
		}
		System.out.println("Longest common prefix is: "+result);
	}

}

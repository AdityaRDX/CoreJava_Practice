package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacter {

	public static void getOccurence(String name) {
		Map<Character, Integer> charCount = new HashMap<>();
		
		int cnt = 1;
		char[] charArr = name.toCharArray();
		for(char c : charArr) {
			if(charCount.containsKey(c)) {
				charCount.put(c, cnt++);
			}
			else {
				charCount.put(c,1);
			}
		}
		System.out.println(name+ " --> " +charCount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "adityaghia";
		getOccurence(str);
	}

}

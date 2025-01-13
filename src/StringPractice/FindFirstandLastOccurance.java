package StringPractice;

public class FindFirstandLastOccurance {
	public static int first = -1;
	public static int last = -1;
	public static void findOccurance(String str,int idx, char element) {
		if(idx == str.length()) {
			System.out.println("First Occurance: "+first);
			System.out.println("Last Occurance: "+last);
			return;
		}
		
		char current = str.charAt(idx);
		if(current == element) {
			if(first == -1) {
				first = idx;
			}
			else {
				last = idx;
			}
		}
		
		findOccurance(str, idx+1, element);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbaacccad";
		findOccurance(str, 0, 'a');
	}

}

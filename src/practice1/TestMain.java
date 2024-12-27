package practice1;
import java.util.*;

public class TestMain {

	public static void linearSearch(int no, Student stdArr[]) {
		for(Student s: stdArr ) {
			if(s.getRoll()== no) {
				s.display();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student("Aditya",84);
		Student s2 = new Student("Sarvesh",96);
		Student s3 = new Student("Tejas",89);
		Student s4 = new Student("Yash",85);
		Student s5 = new Student("Anuj",69);
		
		Student stdArr[] = {s1,s2,s3,s4,s5};
		
		System.out.println("Enter Roll Number to Search");
		int no = sc.nextInt();
		System.out.println();
		
		linearSearch(no, stdArr);
		System.out.println();
		
		
	}

}

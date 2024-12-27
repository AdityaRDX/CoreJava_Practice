package practice1;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	static int cnt;
	
	static {
		cnt =101;
	}
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student() {
		super();
		
	}
	
	public Student(String name, int marks) {
		super();
		this.roll = ++cnt;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Student Roll.no :"+this.roll);
		System.out.println("Student Name :"+this.name);
		System.out.println("Student Marks :"+this.marks);

	}
}

package inheritance;

public class Student {

	
	
	public Student(String rno, String name, String dept, String cgpa) {
		this.rno = rno;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	
	public static void main(String [] args) {
		CSEStudent s = new CSEStudent();
		System.out.print(s);
	}

}

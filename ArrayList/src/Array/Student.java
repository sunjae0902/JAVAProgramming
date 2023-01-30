package Array;

public class Student {
	String name;
	static int serial=1000;
	int studentID;
	
	public Student() {} //디폴트 생성자 
	public Student(String name) {
		this.name=name;
		this.studentID=++serial;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return studentID;
	}
	public void setId(int studentId) {
		this.studentID=studentId;
	}
	
	public void showInfo() {
		System.out.println(studentID+","+name);
	}
}

package StaticExample;

public class Student2 {
	String name;
	static int serial=0;
	int studentID;
	int cardNum;
	
	public Student2() {
		studentID=++serial;//인스턴스가 생성될 때마다 번호 증가 후 학생의 id에 대입. 
		cardNum=studentID+100; //학번에 100을 더한 값. 
		
}
	public String getStudentName() {
		return name;
	}
	
	public void setStudentName(String name) {
		this.name=name;
	}
	
}

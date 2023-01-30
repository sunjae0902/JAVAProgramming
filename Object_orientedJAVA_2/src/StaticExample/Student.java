package StaticExample;
//클래스 내에서 공통으로 사용하는 static변수를 사용하여 학생 인스턴스가 생성될 때마다 연속적인 학번 부여하기. 
public class Student {
	static int serialnum=1000; //인스턴스 생성과 상관없이 먼저 생성되고, 모든 인스턴스가 이 값을 공유함. 
	int studentId; //학생들마다 다른 학번을 부여하기 위해 serial값을 대입해 고유 학번을 저장할 변수 선언.  
	String name;
	int grade;
	String address;
	
	public Student() {
		studentId=++serialnum;//인스턴스가 생성될 때마다 번호 증가 후 학생의 id에 대입. 
		
}
	public String getStudentName() {
		return name;
	}
	
	public void setStudentName(String name) {
		this.name=name;
	}

}

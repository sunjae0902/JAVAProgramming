package ch5_7; //정보 은닉. 접근 제어자 사용 

public class Student {
	int id;
	private String name;
	int grade;
	String address;
	
	
	public String getStudentname() { //학생 이름 가져오기  
		return name;
	}
	public void  setStudentname(String name) { //학생 이름 저장 
		this.name=name;
	}
}

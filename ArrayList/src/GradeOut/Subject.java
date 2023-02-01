package GradeOut;

public class Subject {
	String subName;
	int score;
	
	public Subject() {} //디폴트 생성자. Test파일에서 과목 정보 입력하도록. 
	
	public void setName(String name) {
		this.subName=name;
	}
	public void setScore(int score) {
		this.score=score;
	}
	
	
}

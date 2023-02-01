package GradeOut;
import java.util.ArrayList;

public class Student {
	String studentName;
	int studentId;
	static int serial;
	ArrayList <Subject> subjectlist;
	
	
	public Student() {} //디폴트 생성자 
	public Student(String name) {
		this.studentName=name;
		this.studentId=++serial;
		this.subjectlist=new ArrayList<Subject>(); //학생이 추가될 때마다 과목리스트도 추가됨. 
	}
	public void setSubject(String subName,int score) {
		Subject sub=new Subject();
		sub.setName(subName);
		sub.setScore(score); //과목 이름,, 점수 입력 
		subjectlist.add(sub); //추가 
	}
	

	
	public void showInfo() {
		int sum=0;
		for(Subject sub:subjectlist) {
			sum+=sub.score;
			System.out.println("학생 "+studentName+"의 "+sub.subName+" 과목 성적은 "+sub.score+"입니다 ");
			}
		System.out.println("학생 "+studentName+"의 총점은 "+sum+"입니다 "); //총점 
	}

}

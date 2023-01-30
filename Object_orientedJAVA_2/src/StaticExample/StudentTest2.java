package StaticExample;

public class StudentTest2 {
//학생이 생성될 때마다 고유 학번에 +100을 더한 값인 카드 번호를 부여하는 테스트코드 
	public static void main(String[] args) {
		Student2 s1= new Student2();
		s1.setStudentName("이지원 ");
		Student2 s2= new Student2();
		s2.setStudentName("손승현 ");
		System.out.println("학생이름: "+s1.name+" 학번: "+s1.studentID+" 카드번호: "+s1.cardNum);
		System.out.println("학생이름: "+s2.name+" 학번: "+s2.studentID+" 카드번호: "+s2.cardNum);
	}

}

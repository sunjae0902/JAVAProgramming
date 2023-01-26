package ch5_7;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentname("이상원 "); //값을 직접 대입하는 것이 아니라 해당 메서드를 사용하 private 변수에 접근 가능 
		System.out.println(s1.getStudentname());

	}

}

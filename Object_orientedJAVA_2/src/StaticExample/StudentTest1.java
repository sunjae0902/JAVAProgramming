package StaticExample;

public class StudentTest1 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentName("이지원 ");
		System.out.println(s1.serialnum);//인스턴스명.변수 
		System.out.println("이름: "+s1.name+" 학번: "+s1.studentId);
		
		Student s2=new Student();
		s2.setStudentName("손수경 ");
		System.out.println(Student.serialnum); //인스턴스 이름이 아니라 클래스명으로도 참조 가능. (클래스명.변수) 
		System.out.println("이름: "+s2.name+" 학번: "+s2.studentId);
		

	}

}

package ch5_1_6;

public class StudentTest1{

	public static void main(String[] args) {
		Student student1 = new Student(); //클래스 생성. 힙 영역에 클래스를 사용할 수 있도록 메모리가 할당됨 .
		Student student2 = new Student();
		student1.name="안승연 ";
		System.out.println(student1.name);
		System.out.println(student1.getStudentname());
		student2.name="안연수  ";
		System.out.println(student2.name);
		System.out.println(student2.getStudentname());
		
		
		

	}

}

package GradeOut;

import java.util.ArrayList;

public class GradeOutTest {

	public static void main(String[] args) {
		ArrayList<Student> studentlist=new ArrayList <Student>();
		 
		Student s1=new Student("Lee");
		Student s2=new Student("Kim");
		
		studentlist.add(s1);
		studentlist.add(s2); //학생 리스트 구현 후 추가 
		
		s1.setSubject("국어",100);
		s1.setSubject("수학",50);
		
		s2.setSubject("국어",100);
		s2.setSubject("수학",80);
		s2.setSubject("영어",70);
		
	
		for(Student s:studentlist)
			s.showInfo();
	}

}

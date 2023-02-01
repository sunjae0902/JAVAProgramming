package Array;
import java.util.ArrayList;

public class StudentArrayList {
//arraylist를 사용하여 학생 클래스에 추가하고 출력하기 
	public static void main(String[] args) {
		ArrayList <Student> stulist=new ArrayList<Student> ();
		stulist.add(new Student("James"));
		stulist.add(new Student("Tomas"));
		stulist.add(new Student("Jenny"));
		
		for(Student student:stulist) {
			student.showInfo();
		}

	}

}

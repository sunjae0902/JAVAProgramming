package Array;

public class StudentArray {
	public static void main(String[] args) {
		Student studentlist[]=new Student[3];
		studentlist[0]=new Student("James ");
		studentlist[1]=new Student("Tomas ");
		studentlist[2]=new Student("Edward ");
		
		for(int i=0;i<studentlist.length;i++) {
			studentlist[i].showInfo();
		}
	}
	

}

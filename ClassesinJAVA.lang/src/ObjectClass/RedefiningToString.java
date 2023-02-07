package ObjectClass;

//Object 클래스의 toString() 메서드를 직접 재정의 해보기.
class Student{ //학생 클래스, 이름과 학번. 
	String name;
	int ID;
	static  int serial=1000;
		
	Student(String name) {
		this.name=name;
		this.ID=serial++;
		}
	public String toString() { //이름,학번 형태로 반환하도록 재정의. 
		return name+","+ID;
		}
	}

public class RedefiningToString {
	public static void main(String[] args) {
		Student s1=new Student("홍길동");
		System.out.println(s1.toString());
		Student s2=new Student("이상원");
		System.out.println(s2.toString());
		
	}

}

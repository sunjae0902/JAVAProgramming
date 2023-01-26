package ch5_1_6;

public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person(40,"James",180,68,true,3); //멤버변수의 값을 인스턴스 생성과 동시에 초기화. -> 더 간결하고 편하게 구현 가
		
		p1.age=40; //인스턴스 생성 후 따로 초기화 
		p1.married=true;
		p1.son=3;
		System.out.println("이 사람의 나이 " + p1.age);
		System.out.println("이 사람의 키 " + p1.height);
		System.out.println("이 사람의 몸무게 " + p1.weight);
		System.out.println("이 사람의 이름 " + p1.name);
		System.out.println("이 사람의 결혼 여부 " + p1.married);
		System.out.println("이 사람의 자식 수 " + p1.son);
		

	}

}

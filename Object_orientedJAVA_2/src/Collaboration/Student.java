package Collaboration;
/*학생 클래스 구현. 학생의 이름과 돈을 매개변수로 가지는 생성자를 호출하면 초기화되고
학생이 버스/지하철을 타면 가지고 있는 돈이 각각 1000/1500원이 줄어듦. 마지막 메서드에서는 학생이 현재 가지고 있는 돈을 문장으로 출
*/
public class Student {
	String name;
	int grade;
	int money;
	
	public Student(String name, int money) { //학생의 이름과 가지고 있는 돈을 매개변수로 받는 생성자 
		this.name=name;
		this.money=money;
	}
	public void takeBus(Bus bus){ //버스를 타면 1000원을 지불하는 메소드 
		bus.take(1000); 
		this.money-=1000;
	}
	public void takeSubway(Subway sub) { //지하철을 타면 1500원을 지불하는 메소드 
		sub.take(1500);
		this.money-=1500;
		
}
	public void takeTaxi(Taxi t) { //택시를 타면 10000원을 지불하는 메소드 
		t.take(10000);
		this.money-=10000;
	}

	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다 ");
	}
	
	}
	

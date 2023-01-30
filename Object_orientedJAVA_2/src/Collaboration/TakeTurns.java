package Collaboration;



public class TakeTurns {
 //학생, 버스, 지하철 객체 간 협력 구현하기 
	public static void main(String[] args) {
		Student s1=new Student("James",5000);
		Student s2=new Student("Tomas",10000); //학생 생성
	
		Bus bus100=new Bus(100); //버스번호 100번
		s1.takeBus(bus100); //학생1이 버스를 탐
		s1.showInfo();
		bus100.showInfo();

		Subway line7=new Subway(7); 
		s2.takeSubway(line7); //학생2가 지하철을 탐
		s2.showInfo();
		line7.showInfo();
		
		Student s3=new Student("Edward",20000);
		Taxi t1=new Taxi("5674가 39",1); 
		s3.takeTaxi(t1); //학생3이 택시를 탐
		s3.showInfo();
		t1.showInfo();

	}

}

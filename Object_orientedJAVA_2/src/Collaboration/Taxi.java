package Collaboration;

public class Taxi {
	String id;
	int passengercnt;
	int money;
	
	Taxi(String id, int people){
		this.id=id;
		this.passengercnt=people;
	}
	
	public void take(int money) { //탑승 승객 수 
		this.money+=10000; //택시요금만원 
	}
	
	public void showInfo() {
		System.out.println("택시 "+id+"번의 탑승객은 "+passengercnt+"명이고, 수입은 "+money+"원 입니다 ");
	}

}

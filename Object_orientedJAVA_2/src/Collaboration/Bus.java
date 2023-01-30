package Collaboration;
//버스 클래스. 버스 번호를 매개변수로 하는 생성자를 호출하면 초기화됨. 승객이 타면 버스의 수입을 증가시키고 승객 수를 증가시킴.
public class Bus {
	int busnum;
	int passengercnt;
	int money; //버스 번호, 승객 수 , 수입 
	
	public Bus(int busnum) {
		this.busnum=busnum; 
	}
	public void take(int money) {
		this.money+=money;
		passengercnt++; //승객이 타면 수입을 증가, 승객 수 증가 
	}
	
	public void showInfo() {
		System.out.println("버스 "+busnum+"번의 승객은 "+passengercnt+"명이고, 수입은 "+money+"원 입니다 ");
	}
}

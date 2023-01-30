package Collaboration;

public class Subway {
	int subnum;
	int passengercnt;
	int money; //버스 번호, 승객 수 , 수입 
	
	public Subway(int subnum) {
		this.subnum=subnum; 
	}
	public void take(int money) {
		this.money+=money;
		passengercnt++; //승객이 타면 수입을 증가, 승객 수 증가 
	}
	
	public void showInfo() {
		System.out.println("지하철 "+subnum+"호선의 승객은 "+passengercnt+"명이고, 수입은 "+money+"원 입니다 ");
	}

}

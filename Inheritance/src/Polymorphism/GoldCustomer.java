package Polymorphism;


public class GoldCustomer extends Customer{
	double saleRatio; //할인율 적용
	public GoldCustomer(int customerId, String customerName) {
		super(customerId,customerName); //상위 클래스의 멤버 변수를 사용함
		customerGrade="GOLD";
		bonusRatio=0.02;
		this.saleRatio=0.1;
	}
	
	public int calcPrice(int price) { //재정의 메서드 
		bonusPoint+=price*bonusRatio;
		return (int)(1-saleRatio)*price;
	}

}

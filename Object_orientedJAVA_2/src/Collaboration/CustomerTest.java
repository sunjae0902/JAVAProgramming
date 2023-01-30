package Collaboration;

public class CustomerTest { //고객이 카페에서 원하는 메뉴를 주문하면 고객의 주문 내역과 잔액을 보여주는 객체 지향 프로그래밍. 
	//카페, 고객 간의 협력을 구현 

	public static void main(String[] args) {
		Starbucks menu= new Starbucks();
		menu.showMenu();
		
		Customer c1=new Customer("김씨","아메리카노 ",50000);
		c1.takeCoffee(menu,0);
		c1.showInfo();
	}

}

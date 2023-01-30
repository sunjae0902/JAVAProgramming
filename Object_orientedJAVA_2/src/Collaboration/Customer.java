package Collaboration;


public class Customer {
	String name;
	String menu;
	int money;
	
	public Customer(String name,String menu,int money) {
		this.name=name;
		this.menu=menu;
		this.money=money;
	}
	
	public void takeCoffee(Starbucks m,int i) {
		this.menu=m.menu[i];
		this.money-=m.price[i];
	}
	public void showInfo() {
		System.out.println(name+"님, 주문하신 "+menu+" 나왔습니다. 잔액은 "+money+"원 입니다 " );
	}

	
}

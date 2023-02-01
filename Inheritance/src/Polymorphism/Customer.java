package Polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
    protected String customerGrade; //private이라 외부 클래스에서는 사용하지 못하지만 하위 클래스에서는 사용가능. 
	int bonusPoint;
	double bonusRatio;
	
	public Customer() { //디폴트 생성자. 
		initCustomer(); //고객의 등급과 보너스 포인트 적립률을 지정하는 함수 메서드.
}
	public Customer(int customerId, String CustomerName) {
		this.customerID=customerId;
		this.customerName=CustomerName;
		initCustomer(); 
	}
	public void initCustomer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) { //구매한 가격만큼 보너스 포인트를 적립해주는 메서드. 
		bonusPoint+=price*bonusRatio;
		
		return price;
	}
	
	public String showCustomerInfo() { //고객의 정보를 출력하는 메서드 
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다. ";
	}
	
	public int getId() {return customerID;}
	public void setId(int id) {
		this.customerID=id;
	}
	
	public String getName() {return customerName;}
	public void setName(String name) {
		this.customerName=name;
	}
	public String getGrade() {return customerGrade;}
	public void setGrade(String grade) {
		this.customerGrade=grade;
	}
}

package Polymorphism;

//vip 고객을 따로 관리하는 클래스 -> 일반 고객 클래스를 상속받아 사용함. 
public class VIPCustomer extends Customer {
	private int agentID;//담당 상담원 아이디 
	double saleRatio; //할인 비율 
	
	public VIPCustomer(int customerId, String customerName,int agentId) {
		super(customerId,customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentId;
		
	}
	
	//메서드 오버라이딩: 상위 클래스에 정의한 메서드가 하위 클래스에서 구현할 내용과 맞지 않을 경우 하위 클래스에서 해당 메서드를 재정의함. 반환형/메서드이름/매개변수개수/자료형이 반드시 같아야 함.
	@Override //애노테이션. 해당 메서드가 재정의된 메서드임을 컴파일러에게 명시함. 
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return (int)(price*(1-saleRatio)); //vip: 할인율이 적용된 가격을 지불함. 
	
	}
	//@Override
	public String showCustomerInfo() {//담당 상담원의 번호까지 출력하도록 재정의. 
		return super.showCustomerInfo()+" 담당 상담원 번호는 "+agentID+"입니다 ";	
		}
	
}

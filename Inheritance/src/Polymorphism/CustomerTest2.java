package Polymorphism;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setName("이순신 ");
		customer.setId(10010);
		customer.bonusPoint=1000;
		System.out.println(customer.showCustomerInfo()); //문자열 반환형 함수-> print함수 안에 넣기. , 고객의 등급과 포인트 정보 출력 
		
		
		Customer vipcustomer=new VIPCustomer(10020,"김유신",12345); //vip를 customer형으로 선언.  
		vipcustomer.bonusPoint=1000;
		System.out.println(vipcustomer.showCustomerInfo());
		System.out.println("===할인율과 보너스 포인트 계산===");
		int price=10000;
		System.out.println(customer.customerName+"님이 "+customer.calcPrice(price)+"원 지불하셨습니다. ");
		System.out.println(customer.showCustomerInfo());
		System.out.println(vipcustomer.customerName+"님이 "+vipcustomer.calcPrice(price)+"원 지불하셨습니다. ");
		System.out.println(vipcustomer.showCustomerInfo());
		
		
		
		}

}

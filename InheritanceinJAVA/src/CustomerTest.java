
public class CustomerTest {

	public static void main(String[] args) {
		Customer customer=new Customer();
		VIPCustomer vipcustomer=new VIPCustomer();
		
		customer.setName("이순신 ");
		customer.setId(10010);
		customer.bonusPoint=1000;
		vipcustomer.setName("김유신 ");
		vipcustomer.setId(10020);
		vipcustomer.bonusPoint=10000;
		int price=10000;
		System.out.println(customer.customerName+"님이 지불해야 하는 금액은 "+customer.calcPrice(price)+"원 입니다");
		System.out.println(vipcustomer.customerName+"님이 지불해야 하는 금액은 "+vipcustomer.calcPrice(price)+"원 입니다");
		//고객의 등급과 포인트 출력 
		System.out.println(customer.showCustomerInfo()); //문자열 반환형 함수-> print함수 안에 넣기. 
		System.out.println(vipcustomer.showCustomerInfo());
		}

}

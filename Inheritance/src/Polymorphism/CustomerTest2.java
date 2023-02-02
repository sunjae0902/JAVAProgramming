package Polymorphism;

import java.util.ArrayList;


//배열을 활용해 고객 관리 프로그램 만들기 
public class CustomerTest2 {

	public static void main(String[] args) {
		ArrayList<Customer> customerlist=new ArrayList<Customer>(); //가장 상위 클래스형으로 선언.
		Customer c1=new Customer(10010,"이순신 ");
		Customer c2=new Customer(10020,"신사임당 ");
		Customer c3=new GoldCustomer(10030,"홍길동 ");
		Customer c4=new GoldCustomer(10040,"이율곡 ");
		Customer c5=new VIPCustomer(10050,"김유신 ",12345); //묵시적 형변환.인스턴스 생성 
		customerlist.add(c1); //add메서드로 객체배열리스트에 요소 추가 
		customerlist.add(c2);
		customerlist.add(c3);
		customerlist.add(c4);
		customerlist.add(c5);
		
		System.out.println("======고객 정보 출력======");
		for(Customer customer:customerlist) { //향상된 for문 사용. 
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("======할인율과 보너스 포인트 계산======");
		int price=10000;
		for(Customer customer:customerlist) {
		    int cost = customer.calcPrice(price); //각클래스에서 재정의 된 대로 계산됨. 
		    System.out.println(customer.getName()+"님이 "+cost+"원 지불하셨습니다");
		    System.out.println(customer.getName()+"님의 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
		   
			
		}
		
		
		}

}

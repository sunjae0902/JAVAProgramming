package ch5_1_6;

public class Order { //쇼핑몰 주문 내용을 클래스로 정의하고 출력하기  
	String num;
	String id;
	int year;
	int m,d;
	String name;
	String productnum;
	String address;
	
	

	public static void main(String[] args) {
		Order order1=new Order();
		order1.num="201803120001";
		order1.id="abc123";
		order1.year=2018;
		order1.m=3;
		order1.d=12;
		order1.name="홍길순 ";
		order1.productnum="PD0345-12";
		order1.address="서울시 영등포구 여의도동 20번지 ";
				
		System.out.println("주문 번호 : "+order1.num);
		System.out.println("주문자 아이디  : "+order1.id);
		System.out.println("주문 날짜 : "+order1.year+"년 "+order1.m+"월 "+order1.d+"일 ");
		System.out.println("주문자 이름 : "+order1.name);
		System.out.println("주문 상품 번호 : "+order1.productnum);
		System.out.println("배송 주소 : "+order1.address);

	}

}

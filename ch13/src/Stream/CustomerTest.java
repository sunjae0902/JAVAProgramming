package Stream;

import java.util.List;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1=new Customer("이순신",40,100);
		Customer c2=new Customer("김유신",20,100);
		Customer c3=new Customer("홍길동",13,50);
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		System.out.println("===고객 명단 추가된 순서로 출력===");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total=customerList.stream().mapToInt(c->c.getCost()).sum(); //총여행비용합
		System.out.println("총 여행비용은 "+total+"원 입니다");
		
		System.out.println("===20세 이상 고객 명단 정렬 후 출력===");
		customerList.stream().filter(c->c.getAge()>=20)
		.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}

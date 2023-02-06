package CarList;
import java.util.ArrayList;


public class CarListTest {
//ch9 연습문제- car클래스를 상속받는 다양한 종류의 자동차별로 주행 후 세차 기능 구현하여 출력하기.(TDD 연습)
	public static void main(String[] args) {
		ArrayList <Car> Carlist=new ArrayList<Car>();
		
		Carlist.add(new Sonata());
		Carlist.add(new Grandeur());
		Carlist.add(new Genesis());
		Carlist.add(new Avante());
		
		for(Car c:Carlist) {//향상된 for문
			c.run();
			System.out.println("==================");
		}
		
	}

}

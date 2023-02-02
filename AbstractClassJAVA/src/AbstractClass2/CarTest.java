package AbstractClass2;
//추상 car클래스를 상속받은 버스, 자동차 클래스. -추상클래스 구현해보기 
public class CarTest {
	public static void main (String[] args) {
		Bus bus=new Bus();
		AutoCar car=new AutoCar();
		
		bus.run();
		car.run();
		bus.refuel();
		car.refuel();
		bus.takePassenger();
		car.load();
		bus.stop();
		car.stop();
		
	}
}

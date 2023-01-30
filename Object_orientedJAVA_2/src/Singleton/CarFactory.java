package Singleton;

public class CarFactory {
	private static CarFactory instance =new CarFactory();
	private CarFactory() {} //생성자 선언
	
	public static CarFactory getInstance() {
		if(instance==null) {
			instance=new CarFactory();
		}
		return instance; //인스턴스(자동차 공장) 반환 
	}
	
	public Car createCar() { //자동차 인스턴스를 생성함. 
		Car c=new Car();
		return c;
	}
}

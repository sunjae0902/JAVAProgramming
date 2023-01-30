package Singleton;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory fact=CarFactory.getInstance(); //공장 인스턴스. 
		Car mysonata=fact.createCar(); //차 인스턴스 생성. 
		Car yoursonata=fact.createCar();
		System.out.println(mysonata.getCarNum()); //10001출력 
		System.out.println(yoursonata.getCarNum()); //10002출력 
}

}
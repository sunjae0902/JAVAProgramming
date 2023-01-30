package Singleton;

public class Car {
	static int serial=10000;
	int carnum;
	
	public Car() { //생성자-> 차 번호 부여 
		this.carnum=++serial;
	}
	public int getCarNum() {
		return carnum;
	}

}

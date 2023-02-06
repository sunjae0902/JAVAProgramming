package TempletMethod1;

public class AlCar extends Car { //Car를 상속받음.->자율주행이 가능하도록 추상 메서드를 구현해야 함.
	@Override
	public void drive() {
		System.out.println("자율 주행 자동차입니다.\r자동차가 알아서 방향을 전환합니다.");
	}
	@Override
	public void stop() {
		System.out.println("자동차가 알아서 멈춥니다.");
	}
	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 자동으로 빠르기가 조절됩니다.");
	}
}

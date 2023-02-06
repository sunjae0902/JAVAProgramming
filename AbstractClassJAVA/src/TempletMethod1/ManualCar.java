package TempletMethod1;

public class ManualCar extends Car { //사람이 직접 조작하는 자동차. 
	@Override
	public void drive() {
		System.out.println("사람이 직접 운전합니다.\r핸들로 방향을 전환합니다.");
	}
	@Override
	public void stop() {
		System.out.println("브레이크를 밟아 멈춥니다.");
	}
	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조정합니다.");
	}

}

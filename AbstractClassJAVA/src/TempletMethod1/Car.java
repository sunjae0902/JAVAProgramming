package TempletMethod1;
//템플릿 메서드: 모든 객체 지향 언어에서 사용하는 하나의 디자인 패턴. 추상 클래스를 사용하여 구현할 수 있다. 

public abstract class Car {
	public abstract void drive(); //차종에 따라 다르게 움직일 수 있도록 추상 메서드로 선언 
	public abstract void stop();
	public abstract void wiper();
	
	public void StartCar() {
		System.out.println("시동을 켭니다. ");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다. ");
	}
	
	final public void run() { //템플릿 메서드 run(): 자동차가 달리는 방법을 순서대로 구현함. 따라서 Car클래스를 상속받은 클래스는 모두 이 순서대로 동일하게 달림. 
		StartCar(); //예약어 final: 더 이상 재정의 할 수 없음. 
		drive();
		wiper();
		stop();
		turnOff();
	}
}

package AbstractClass1;


public abstract class Computer {//추상 메서드를 포함하는 클래스는 추상 클래스 이므로 예약어 붙임. 
	public abstract void display(); //함수의 몸체가 없는 추상메서드 선언. 
	public abstract void typing(); 
	// 위 두 함수를 추상 메서드로 선언한 것의 의미: 해당 클래스를 상속 받는 하위 클래스에 따라 구현이 달라질 수 있으므로 해당 메서드 구현의 책임을 하위 클래스로 위임함. 
	//추상 클래스는 인스턴스를 생성할 수 없음. 추상 메서드에 구현된 내용이 없기 때문. 
	

}

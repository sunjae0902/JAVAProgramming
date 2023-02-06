package DefaultMethod;
//디폴트 메서드: 인터페이스에서 기본으로 제공되는 메서드. 디폴트 메서드는 인터페이스에서 구현하고 인터페이스를 구현할 클래스에서 사용할 기본 기능이 됨.

public interface Calc {
	double PI=3.14;
	int ERROR=-99999999; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환된다.
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide (int num1,int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환된다. -> abstract예약어 필요없음.
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다 "); //일반 메서드와 똑같이 구현하며, default 예약어를 사용함. 하위 클래스에서 재정의 가능. 
	}
	
}

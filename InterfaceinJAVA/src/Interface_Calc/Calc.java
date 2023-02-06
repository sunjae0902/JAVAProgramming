package Interface_Calc;
 //interface: 클래스/프로그램이 제공하는 기능을 클라이언트에 명시적으로 선언하는 역할. 인터페이스는 추상 메서드와 상수만으로 이루어져있다. -> 인터페이스를 활용한 간단한 계산기 프로그램을 만들기.

public interface Calc {
	double PI=3.14;
	int ERROR=-99999999; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환된다.
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide (int num1,int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환된다. -> abstract예약어 필요없음.
	

	
}


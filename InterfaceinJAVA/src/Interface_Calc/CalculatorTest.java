package Interface_Calc;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		CompleteCalc calc =new CompleteCalc();
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.substract(num1,num2));
		System.out.println(calc.times(num1,num2));
		System.out.println(calc.divide(num1,num2));
		calc.showInfo();

	} //Calc 인터페이스: 추상 메서드만 존재하므로 인스턴스 생성 불가
	//Calculator 클래스: 여전히 추상 클래스이므로 인스턴스 생성 불가.
	// Calc인터페이스와 calculator 클래스 형 변수에서는 인터페이스에서 선언한 메서드만 사용할 수 있음.

}
package Interface_Calc;

public abstract class Calculator implements Calc{ //인터페이스에서 추상 메서드로 선언한 기능을 클래스를 활용해 구현한다는 의미의 예약어 implements 사용. 
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int substract(int num1, int num2) { //4개의 메서드 중 2개만 구현했으므로 여전히 추상 클래스임. 
		return num1-num2;
	}
	
}

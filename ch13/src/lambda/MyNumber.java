package lambda;
// 두 수 중 큰 수를 반환하는 함수를 람다식으로 구현하기. 
@FunctionalInterface //두 개 이상의 메서드를 선언하는 오류를 방지하기 위해 사용 
public interface MyNumber {
	int getMax(int x,int y); //추상 메서드 선언 
}
//인터페이스가 필요한 이유: 자바에서는 참조 변수 없이 메서드를 호출할 수 없으므로 람다식을 구현하려면 함수형 인터페이스를 선언해야 함. 
//함수의 이름이 없는 익명 함수 이므로 한 인터페이스에서 두 개 이상의 메서드를 가질 수 없음. 
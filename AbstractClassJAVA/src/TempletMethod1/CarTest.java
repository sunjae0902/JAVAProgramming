package TempletMethod1;

public class CarTest {

	public static void main(String[] args) {
		Car AI=new AlCar();
		//인스턴스 생성 
		System.out.println("===자율 주행 자동차===");
		AI.run();
		System.out.println("===일반 주행 자동차===");
		Car MC=new ManualCar(); 
		MC.run();
		//템플릿 메서드 호출. 메서드의 실행 순서와 시나리오를 정의하는 역할. 하위 클래스에서 템플릿 메서드를 재정의하는 것은 불가능하며, 추상 메서드를 선언함으로써 각 객체마다 구현 내용을 달리 할 수 있다.
		

	}

}

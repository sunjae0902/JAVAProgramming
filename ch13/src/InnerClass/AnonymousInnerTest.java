package InnerClass;
// 익명 내부 클래스. 내부 클래스의 이름을 생략해도 될 때 사용 

class Outer2{
	Runnable getRunnable(int i) { //외부 클래스 내부의 일반 메서드. 
		int num = 100;

		return new Runnable() { //메서드 안의 익명클래스.MyRunnable 클래스 이름을 빼고 클래스를 바로 생성하는 방법
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner =new Runnable() { //인터페이스나 추상 클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법 
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	}; //익명 클래스 끝에 ;
}
public class AnonymousInnerTest {

	public static void main(String[] args) {
	}

}

package InnerClass;
//지역 내부 클래스: 지역 변수처럼 메서드 내부에 정의된 클래스를 뜻함.->메서드 안에서만 사용 가능 

class Outer{
	int outNum=1;
	static int sNum=200;
	
	Runnable getRunnable(int i) {
		int num=100; //지역 변수 
		
		class MyRunnable implements Runnable{ //지역 내부 클래스 . Runnable 인터페이스의 run()메서드 구현 
			int localNum=10; //지역 내부 클래스에서 사용하는 메소드의 지역 변수는 모두 상수값 
			
			@Override
			public void run() {
				System.out.println("i= "+i);
				System.out.println("num= "+num);
				System.out.println("localNum= "+localNum);
				System.out.println("outNum= "+outNum+"(외부 클래스 인스턴스 변수) ");
				System.out.println("Outer.sNum= "+Outer.sNum+"외부 클래스 정적 변수" );
			}
		}
		return new MyRunnable(); //해당 클래스를 생성한 후 반환함 
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out=new Outer();
		Runnable runner=out.getRunnable(10); //해당 메서드로 runnable 객체를 생성한 후 반환받아 사용가능 
		runner.run(); //메서드 호출 
	}

}

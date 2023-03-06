package InnerClass; //인스턴스 내부 클래스 구현해보기 


class Outclass{ //외부 클래스 
	private int num=10;
	private static int sNum=20; //외부 클래스 내 private 변수와 정적 변수 
	
	private InClass inClass;  //내부 클래스의 자료형과 변수를 먼저 선언. 
	
	public Outclass() { //외부 클래스의 디폴트 생성자-> 내부 클래스 생성 
		inClass=new InClass(); 
	}
	
	class InClass { // 내부 클래스 정의 
		int inNum=100;
		//인스턴스 내부 클래스 안에 정적변수 선언 불가 
		void inTest() {
			System.out.println("OutClass num= "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum= "+sNum+"(외부 클래스의 정적 변수)");
		}
	}
	
		static class InStaticClass{ //정적 내부 클래스 
			int inNum=100; //정적 내부 클래스 안의 인스턴스 변수 
			static int sInNum=200; //정적 내부 클래스의 정적 변수 
			
			void inTest() { //정적 클래스 내부의 일반 메서드. 
				System.out.println("InStaticClass inNum= "+inNum+"(내부 클래스의 인스턴스 변수 사용 ");
				System.out.println("InStaticClass sInNum= "+sInNum+"(내부 클래스의 정적 변수 사용 ");
				System.out.println("InStaticClass sNum= "+sNum+"(외부 클래스의 정적 변수 사용 ");
			}
			
			static void sTest() { //정적 클래스 내부의 정적 메서드 . 정적 메서드 내부에서느 인스턴스 변수 사용 불가 
				System.out.println("OutClass sNum= "+sNum+"(외부 클래스의 정적 변수 사용 ");
				System.out.println("InStaticClass sInNum= "+sInNum+"(내 클래스의 정적 변수 사용 ");
				
			}
		}
	
/*	public void usingClass() {
		inClass.inTest();
	}  외부 클래스를 통하여 내부 클래스 메서드 호출. */ 
}



public class InstanceInnerTest {
	public static void main(String[] args) {
		Outclass.InStaticClass sInClass=new Outclass.InStaticClass();
		// 외부 클래스를 생성하지 않아도 바로 내부 클래스를 생성 가능. 
		
		System.out.println("정적 내부 클래스 일반 메서드 호출 ");
		sInClass.inTest();
	
		
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출 ");
		Outclass.InStaticClass.sTest();

	}

}

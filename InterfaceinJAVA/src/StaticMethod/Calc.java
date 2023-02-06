package StaticMethod;
//정적 메서드: static예약어 사용. 클래스 생성과 무관하게 사용할 수 있음. 정적 메서드 사용 시 인터페이스 이름으로 직접 참조하여 사용. 

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
    static int total(int[] arr){ //주어진 배열의 모든 요소 값을 더해 반환하는 정적 total메서드 
    	int sum=0;
    	for(int i=0;i<arr.length;i++) sum+=arr[i];
    	
    	return sum;
    }
	
}

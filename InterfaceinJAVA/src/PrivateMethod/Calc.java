package PrivateMethod;
//private 메서드: 인터페이스에서 모두 구현하며 하위클래스에서 재정의 할 수 없으므로 기존에 구현된 코드를 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용할 경우 선언. 

public interface Calc {
	double PI=3.14;
	int ERROR=-99999999; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환된다.
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide (int num1,int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환된다. -> abstract예약어 필요없음.
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다 "); //일반 메서드와 똑같이 구현하며, default 예약어를 사용함. 하위 클래스에서 재정의 가능. 
		myMethod(); //디폴트 메서드에서 private 메서드 호출. 
	}
	
    static int total(int[] arr){ //주어진 배열의 모든 요소 값을 더해 반환하는 정적 total메서드 
    	int sum=0;
    	for(int i=0;i<arr.length;i++) sum+=arr[i];
    	myStaticMethod(); //정적 메서드에서 private static 메서드 호출. 
    	return sum;
    }
    
    private void myMethod() { //인터페이스에 모든 코드를 구현하고 재정의 할 수 없으므로 추상 메서드에 해당 메서드를 선언할수는 없지만 static 예약어는 함께 사용할 수 있음 
    	System.out.println("private 메서드입니다 ");
    }
    private static void myStaticMethod() {
    	System.out.println("private static 메서드입니다"); //해당 메서드는 정적 메서드에서 호출. 
    }
	
}

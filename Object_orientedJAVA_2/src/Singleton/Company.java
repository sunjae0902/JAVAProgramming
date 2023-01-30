package Singleton;

public class Company {
	private static Company instance=new Company(); //프로그램 전체에서 사용할 유일한 인스턴스. -> 인스턴스 오류방지 
	private Company() {} //반드시 접근 제어자가 private인 생성자를 명시적으로 선언 
	
	public static Company getInstance() { //인스턴스를 외부에서 참조할 수 있도록 public 메서드 구현. 인스턴스 생성과 상관없이 호출할 수 있어야 하므로 static선언  
		if (instance==null) {
			instance=new Company(); //생성자 호출 
		}
		return instance; //유일한 인스턴스 반환  
	}
 }

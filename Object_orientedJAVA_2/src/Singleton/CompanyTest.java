package Singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company c1=Company.getInstance(); //클래스명으로 참조하여 호출. 참조 변수에 대입 
		Company c2=Company.getInstance(); 
		System.out.println(c1==c2); //둘이 같은 주소인지 확인 . 하나의 인스턴스만 사용하므로 같은 주소임. 
	}

}

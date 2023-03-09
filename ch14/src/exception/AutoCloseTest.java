package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj=new AutoCloseObj()){ //사용할 리소스 선언. 여러개는 ;로 구분
			throw new Exception(); //강제로 에러 발생 ->리소스 닫은 후 catch문 실행 
		}catch(Exception e) {
			System.out.println("예외 부분입니다 ");
		}
	}

}

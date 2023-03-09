package exception;

public class AutoCloseObj implements AutoCloseable { //인터페이스를 구현한 클래스 
	@Override
	public void close() throws Exception{
		System.out.println("리소스가 close() 되었습니다 ");
	}
	
}

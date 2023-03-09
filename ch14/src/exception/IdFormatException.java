package exception;

public class IdFormatException extends Exception { //사용자 정의 예외 처리. 아이디에 조건을 걸어야 할 때.
	public IdFormatException(String message) {//생성자의 매개변수로 예외 상황 메시지 받음 
		super(message); //메시지 생성자와 멤버 변수, 메서드를 제공하는 exception 클래스로 전달. 
	}

}

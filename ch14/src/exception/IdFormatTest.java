package exception;

public class IdFormatTest { //사용자 정의 예외 처리 
	private String UserID;
	
	public String getUserId() {
		return UserID;
	}
	
	public void setUserId(String UserId) throws IdFormatException {
		if(UserId==null) {
			throw new IdFormatException("아이디는 null일 수 없습니다 "); //예외 상황메시지 
		}
		else if (UserId.length()<8 || UserId.length()>20) {
			throw new IdFormatException("아이디는 8자 이상 20자 이하입니다.");
		}
		this.UserID=UserId;
	}
	public static void main(String[] args) {
		IdFormatTest test=new IdFormatTest();
		
		String userid=null;
		
		try { //아이디가 null일 경우 
			test.setUserId(userid);
		} catch(IdFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userid="1234567";
		try { //아이디가 7자일 경우 
			test.setUserId(userid);
		}catch(IdFormatException e){
			System.out.println(e.getMessage());
		}
	}

}

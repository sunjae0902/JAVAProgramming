package exception;

public class PwdExceptionTest {
	private String pwd;
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) throws PwdException {
		if(pwd==null) {
			throw new PwdException("비밀번호는 Null일 수 없음 ");
			}
		else if (pwd.length()<5) {
			throw new PwdException("비밀번호는 5자 이상이어야 함 ");
		}
		else if (pwd.matches("[a-zA-Z]+")) {
			throw new PwdException("비밀번호는 문자로만 구성됨 ");
		}
		this.pwd=pwd;
		
	}

	public static void main(String[] args) {
		//사용자 정의 에러 처리 하기-비밀번호. 
		PwdExceptionTest test=new PwdExceptionTest();
		String pwd=null;
	    try{
	    	test.setPwd(pwd);
	    } catch(PwdException e) {
	    	System.out.println(e.getMessage());
	    }
	    pwd="ab3";
	    try{
	    	test.setPwd(pwd);
	    } catch(PwdException e) {
	    	System.out.println(e.getMessage());
	    }
	    pwd="abc";
	    try{
	    	test.setPwd(pwd);
	    } catch(PwdException e) {
	    	System.out.println(e.getMessage());
	    }

	}

}

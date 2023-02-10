package Collection;

public class Member {
	private int memberId;
	private String memberName; 
	
	public Member(int id, String name) {
		this.memberId=id;
		this.memberName=name;
		
	}
	
	public int getId(){
		return memberId;
	}
	
	public String getName() {
		return memberName;
		}
	public void setNmae(String name) {
		this.memberName=name;
	}
	
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberId+" 입니다.";
	}
	}

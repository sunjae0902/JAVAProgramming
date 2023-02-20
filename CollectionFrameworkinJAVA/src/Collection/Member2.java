package Collection;

import java.util.Comparator;

//정렬을 구현하는데 사용하는 Comparator 인터페이스를 구현하는 Member2클래스
public class Member2 implements Comparator <Member2>{ 
	private int memberId;
	private String memberName;
	
	public Member2(int memberid, String name) {
		this.memberId=memberid;
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
	
	@Override
	public int hashCode() { //해당 메서드가 회원의 아이디를 반환하도록 재정의 <객체가 동일함을 구현하기>-> 아이디가 같으면 중복이므로 출력되지 않음
		return memberId;
	}
	@Override
	public boolean equals(Object obj) { //해당 메서드에서 매개변수로 받은 회원의 아이디가 자신의 아이디와 같으면 true반환 
		if(obj instanceof Member2) {
			Member2 member=(Member2) obj;
			if(this.memberId==member.memberId)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int compare(Member2 m1, Member2 m2) {
		return m1.getId()-m2.getId(); //compare함수 재정의. 전달 받은 두 매개변수 회원의 아이디를 비교함 
	}
	

}

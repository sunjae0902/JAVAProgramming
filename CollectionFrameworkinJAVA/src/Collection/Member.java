package Collection;

public class Member implements Comparable<Member> {
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
	
	@Override
	public int hashCode() { //해당 메서드가 회원의 아이디를 반환하도록 재정의 <객체가 동일함을 구현하기>-> 아이디가 같으면 중복이므로 출력되지 않음
		return memberId;
	}
	@Override
	public boolean equals(Object obj) { //해당 메서드에서 매개변수로 받은 회원의 아이디가 자신의 아이디와 같으면 true반환 
		if(obj instanceof Member) {
			Member member=(Member) obj;
			if(this.memberId==member.memberId)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		return this.memberName.compareTo(member.memberName); //오름차순으로 정렬할 수 있는 비교함수 재정의. STRING클래스에 해당 함수가 재정의 되어 있으므로 활용함 (새로 추가된 이름, 매개변수로 전달된 회원이름. 
	}
	
	}

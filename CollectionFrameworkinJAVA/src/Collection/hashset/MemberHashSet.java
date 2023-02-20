package Collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import Collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashset; //선언 
	
	public MemberHashSet() {
		hashset=new HashSet<Member>(); //생성 
	}
	
	public void addMember(Member member) {
		hashset.add(member); //추가하는 메서드 
	}
	
	public boolean removeMember(int memberId) { //id에 해당하는 회원을 삭제하고 true를 반환하는 메서드 
		Iterator <Member> ir= hashset.iterator(); //요소를 순회함 
		
		while(ir.hasNext()) {
			Member member=ir.next();
			if (member.getId()==memberId) {
				hashset.remove(member);
				return true;
			}
	}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() { //모든 멤버를 보여주는 메서드 
		for(Member m:hashset) {
			System.out.println(m);
		}
		System.out.println();
	}
		
	

}

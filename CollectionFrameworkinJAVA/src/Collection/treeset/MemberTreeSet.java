package Collection.treeset; //TreeSet 구조를 활용해 회원 관리 프로그램 구현하기 

import java.util.TreeSet;

import java.util.Iterator;

import Collection.Member;

public class MemberTreeSet {
	private TreeSet <Member> treeset;
	
	public MemberTreeSet() {
		treeset=new TreeSet<Member>();
	}
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	public boolean removeMember(int memberid) {
		Iterator<Member> ir=treeset.iterator();
		
		while(ir.hasNext()) {
			Member member=ir.next();
			if(member.getId()==memberid) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for(Member member:treeset) {
			System.out.println(member);
		} 
		System.out.println();
	}
	
}

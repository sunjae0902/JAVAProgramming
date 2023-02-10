package Collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import Collection.Member; //Collection 패키지 하위에 있는 Member클래스를 사용하려면 

public class MemberArrayList {
	private ArrayList<Member> arrayList; //선언 
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();// Member형으로 선언한 arraylist 생성
	}
	
	public void addMember(Member member) { //새로운 회원 자료형을 추가하는 메서드 
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { // id에 해당하는 회원을 삭제하는 메서드
		Iterator<Member> ir = arrayList.iterator(); //순서가 없눈 클래스도 순회할 수 있는 iterator 사용 	
		while(ir.hasNext()) { //다음 요소가 존재하지 않을 때까지..
			Member member=ir.next(); //다음 요소 저장 
			if(member.getId()==memberId)
				arrayList.remove(member);
				return true;
			}
		
		System.out.println(memberId + "가 존재하지 않습니다."); //해당하는 회원의 아이디가 존재하지 않는 경우 
		return false;
	}
	
	public void showAllMember() { //남아있는 모든 회원들을 보여주는 메서드 
		for(Member member:arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insetMember(Member member, int index) { //특정 위치에 멤버를 추가하는 메서드.
		arrayList.add(index,member);
		
	}
	
}

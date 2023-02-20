package map.hashmap;

import java.util.Iterator;
import java.util.HashMap;
import Collection.Member;

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap; //hashmap 자료형선언
	
	public MemberHashMap() {
		hashMap=new HashMap();
		}
	public void addMember(Member member) {
		hashMap.put(member.getId(),member); //해시 맵에 회원을 키-값 쌍으로 추가하는 메서드. put메서드 이용. 
	}
	
	public boolean removeMember(int memid) {
		if(hashMap.containsKey(memid)) { //만약 해당 아이디를 가진 회원이 존재한다면 삭제하는 메서드 
			hashMap.remove(memid);
			return true;
		}
		return false; //존재x
	}
	
	public void showAllMembers() {
		Iterator<Integer> ir=hashMap.keySet().iterator();//키 값을 Set객체로 반환해서(중복 불가) 순회하는 Ir 
		while(ir.hasNext()) { //다음 키 값이 있으면 키에 해당하는 값을 가져와서 멤버 변수에 저장 
			int key=ir.next();
			Member member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}

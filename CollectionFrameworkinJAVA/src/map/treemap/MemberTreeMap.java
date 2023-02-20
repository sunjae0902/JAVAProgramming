package map.treemap;
import java.util.Iterator;
import java.util.TreeMap;
import Collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer,Member> treemap; //key값으로 자료를 정렬할 때 사용하는 treemap.
	public MemberTreeMap() {
		treemap=new TreeMap();
	}
	public void addMember(Member member) {
		treemap.put(member.getId(),member); //키-값 쌍으로 자료 저장 
	}
	
	public boolean removeMember(int memid) {
		if(treemap.containsKey(memid)) {
			treemap.remove(memid);
			return true;
		}
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=treemap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=treemap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}

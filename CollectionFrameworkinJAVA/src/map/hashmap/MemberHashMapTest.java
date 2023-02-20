package map.hashmap;
import Collection.Member;
public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberhashMap=new MemberHashMap();
		
		Member m1= new Member(1001,"이지원");
		Member m2= new Member(1002,"손민국");
		Member m3= new Member(1003,"박서원"); //쌍으로 된 자료를 관리하는 hashmap. Key는 중복될 수 없으며 Value는 중복 가능. 해시 함수를 사용하며 충돌이 일어나기 전에 자동으로 공간을 확장하여 충돌을 방지함 
		
		memberhashMap.addMember(m1);
		memberhashMap.addMember(m2);
		memberhashMap.addMember(m3);
		
		memberhashMap.showAllMembers();
		
		memberhashMap.removeMember(1002);
		memberhashMap.showAllMembers();
		
		
	}

}

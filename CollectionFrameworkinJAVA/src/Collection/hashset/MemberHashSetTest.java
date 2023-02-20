package Collection.hashset;
import Collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashset=new MemberHashSet();
		
		Member m1= new Member(1001,"이지원");
		Member m2= new Member(1002,"손민국");
		Member m3= new Member(1003,"박서원");
		
		memberHashset.addMember(m1);
		memberHashset.addMember(m2);
		memberHashset.addMember(m3);
		
		memberHashset.showAllMembers();
		
		Member nm=new Member(1003,"홍길동"); //Member 클래스에 객체가 동일한 경우 처리하는 방법이 아짓 정의되지 않으면 그대로 추가됨. 
		
		memberHashset.addMember(nm);
		memberHashset.showAllMembers();
		
		
		

	}
}
package Collection.treeset;	
import Collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		

		Member m1= new Member(1001,"이지원");
		Member m2= new Member(1002,"손민국");
		Member m3= new Member(1003,"박서원");
		
		memberTreeSet.addMember(m1);
		memberTreeSet.addMember(m2);
		memberTreeSet.addMember(m3);
		
		memberTreeSet.showAllMembers();
		
		 // 이진트리에서 어떤 기준으로 노드를 비교하여 정렬할 지 정하는 Comparable 인터페이스를 구현해야 함 .-> 어디에서? 정렬 값이 있는 Member 클래스에서. 중복 허용 안하면서 정렬된 결과를 출력함. 

	}
}

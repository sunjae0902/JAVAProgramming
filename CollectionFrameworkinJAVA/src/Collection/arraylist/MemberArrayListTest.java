package Collection.arraylist;

import Collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberarraylist=new MemberArrayList();
		
		Member m1=new Member(1001,"이지원");
		Member m2=new Member(1002,"손민국");
		Member m3=new Member(1003,"박서훤");
		Member m4=new Member(1004,"홍길동");
		Member m5=new Member(1005,"추가된사람1");
		memberarraylist.addMember(m1);
		memberarraylist.addMember(m2);
		memberarraylist.addMember(m3);
		memberarraylist.addMember(m4);
		
		memberarraylist.showAllMember();
		
		memberarraylist.removeMember(m4.getId()); //홍길동 회원 삭제 
		
		memberarraylist.insetMember(m5,2); //2번쨰 위치애 5번째 회원 추가. 
		
		memberarraylist.showAllMember();
	
			
		
	}

}

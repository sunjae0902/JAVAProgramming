package map.treemap;
import Collection.Member;
public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap membertreeMap=new MemberTreeMap();
		
		Member m1= new Member(1003,"박서원"); //key: 학번, Integer형 -> comparable 인터페이스가 구현되어있어 따로 구현할 필요 없음. 
		Member m2= new Member(1002,"손민국");
		Member m3= new Member(1001,"이지원");
		
		membertreeMap.addMember(m1);
		membertreeMap.addMember(m2);
		membertreeMap.addMember(m3);
		
		membertreeMap.showAllMember(); //학번을 기준으로 오름차순 정렬됨 

	}

}

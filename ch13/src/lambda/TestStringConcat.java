package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 클래스로 구현하는 테스트 코드 
		String s1="Hello";
		String s2="World";
		StringConcatlmpl concat1=new StringConcatlmpl();
		concat1.makeString(s1,s2);
		
		//람다식으로 구현하기 
		StringConcat concat2=(s,v)->System.out.println(s+","+v);
		concat2.makeString(s1,s2);
	}

}

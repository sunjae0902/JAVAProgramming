package lambda;

public class StringConcatlmpl implements StringConcat {
// 클래스에서 인터페이스 구현하기
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);

	}

}

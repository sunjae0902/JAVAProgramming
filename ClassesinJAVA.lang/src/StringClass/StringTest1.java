package StringClass;

public class StringTest1 {
//String 클래스에서 String을 생성자로 생성했을 때와 문자열 상수를 바로 가리킬 때 주소 값을 비교하는 예제.
	public static void main(String[] args) {
		String str1=new String ("abc");
		String str2=new String ("abc"); 
		
		System.out.println(str1==str2); //인스턴스가 생성될때 마다 새로운 메모리 주소 값이 할당되므로 false반환
		System.out.println(str1.equals(str2));  //둘은 논리적으로 같은 값이므로 true반환
		
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4); //둘 다 상수 풀에 저장된 같은 값을 가리키므로 true반환.
		System.out.println(str3.equals(str4));  //둘은 논리적으로 같은 값이므로 true반환 
		
		
		// 두 문자열 연결하기-> stirng클래스의 final char[]변수는 final로 선언되어 한 번 선언하면 변경할 수 없다. 따라서 기존 문자열에 다른 문자열을 더하면 그것은 두 문자열이 연결된 새로운 문자열이된다. ->메모리 낭비 가능.  
		
		String javaStr= new String("java");
		String androidStr=new String(" and android");
		System.out.println(javaStr);
		System.out.println("처음 주소 값: "+System.identityHashCode(javaStr));
		
		javaStr=javaStr.concat(androidStr);
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(javaStr));
		
		
		//StringBuffer, StringBuilder 클래스 사용하기 -> 문자열은 연결하거나 변경할 경우 char[]배열을 확장하여 추가 메모리를 사용하지 않고 기존 문자열을 변경할 수 있음.
		//StringBuffer: 멀티 스레드 프로그램으로 동시에 문자열을 변경할때 사용 , 일반적으로는 StringBuilder사용 
		
		StringBuilder strBuf=new StringBuilder(javaStr);  //java문자열에 여러 문자열을 추가 할 경우 StringBuilder 클래스 생성 후 append메서드로 추가. 
		System.out.println("연산 전 buffer 메모리 주소: "+System.identityHashCode(strBuf));
		strBuf.append(" programming is fun! ");
		System.out.println("연산 후 buffer 메모리 주소: "+System.identityHashCode(strBuf)); //기존 문자열을 변경하므로 메모리 주소 값이 변하지 않음
		
		javaStr=strBuf.toString(); //String 클래스로 변환 -> 다시 문자열로 반환.
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 주소 :"+System.identityHashCode(javaStr));
		
		

}
}
	
	
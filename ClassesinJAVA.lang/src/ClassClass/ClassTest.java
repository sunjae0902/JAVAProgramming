package ClassClass;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{//클래스를 찾지 못할 경우 에러 처리.
		Person person=new Person();
		Class pClass1=person.getClass(); //생성자가 이미 생성된 상태에서 사용 가능. 클래스의 이름을 반환2
		System.out.println(pClass1.getName());

		Class pClass2=Person.class; //직접클래스파일대입하기 
		System.out.println(pClass2.getName());
		
		Class pClass3=Class.forName("ClassClass.Person");//패키지 명, 클래스 이름으로 가져오기 
		System.out.println(pClass3.getName());
		
		
		
		
		
		
		
		
		

	}

}

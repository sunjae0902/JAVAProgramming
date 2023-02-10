package ClassClass;

public class NewInstanceTest {
//가져온 클래스 정보를 바탕으로 새 인스턴스를 생성하기 
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1=new Person();
		System.out.println(person1);
		
		Class pClass=Class.forName("ClassClass.Person"); //forName 메서드: 로딩할 클래스를 동적으로 변경할 수 있음. 
		Person person2=(Person) pClass.newInstance(); //해당 메서드를 사용하여 새 인스턴스를 생성. 항상 Object형으로 반환하므로 생성된 객체형으로 형변환해야함
		System.out.println(person2);
		
		
	}

}

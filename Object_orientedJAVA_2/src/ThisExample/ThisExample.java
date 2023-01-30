package ThisExample;


class Birthday{ //한 파일에 두 클래스 존재. 객체를 코드로 구현한 birthday클래스.public 예약어는 하나만 존재.
	int y,m,d;
	
	public void setYear(int year) {
		this.y=year;
	}
	public void Printthis() {
		System.out.println(this);
	}
}
class Person { //생성자에서 다른 생성자를 호출하는 this. 
	int age;
	String name;
	
	Person(){ //디폴트 생성자.초깃값 설정. this를 사용해서 Person(name,age) 생성자 호출 
		this("이름 없음 ",1);
	}
	
	Person(String name, int age){ //매개 변수를 가지는 생성자. 
		this.name=name;
		this.age=age;
	}
	Person returnIself() {
		return this; //클래스형 반환. 자신의 주소값 반환 
	}
}
//메인 함수가 포함된 테스트용 클래스. public예약어가 붙어있음. 자바의 파일 이름과 같아야 함. 
public class ThisExample { //예약어 this: 생성된 인스턴스 스스로를 가리키는 예약어 
	public static void main(String[] args) {
		Birthday bday=new Birthday(); //생성자 호출. 참조변수 선언
		bday.setYear(2000); //2000년으로 지정 
		System.out.println(bday); //참조변수 출력->클래스 이름@메모리주소 
		bday.Printthis(); //위와 출력결과 같음->this는 생성된 인스턴스 자신을 가리킴  
		
		Person noName=new Person(); //출력해보는 테스트 코드 -> 디폴트 생성자 호출.  
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p=noName.returnIself(); //자기 자신의 주소값을 반환하는 함수의 반환값을 p가 가르킴. 
		System.out.println(p);
		System.out.println(noName); //동일 내용 출력  
	}

}

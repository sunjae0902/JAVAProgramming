package Exercise; //연습문제 5 

public class Student {
	private String id;
	private String name;

	
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode() { //정보가 저장된 위치를 반환하는 메서드 id를 Int형으로 변형해서 반환하도록 재정의 
		return Integer.valueOf(id);
	}
	@Override
	public String toString() { //인스턴스 정보를 문자열로 반환하는 함수를 (클래스이름+주소값) 문제가 원한느 출력 형식으로 출력되도록 재정의 

		return id +":"+name;
	}
	
	@Override 
	public boolean equals(Object obj) { //중복된 값을 처리하는 함수 재정의 
		if(obj instanceof Student) {
			Student s=(Student) obj;
			if(s.id==this.id) 
				return true;
			else return false;
		}
		return false;
		
	}
	
	
   
}

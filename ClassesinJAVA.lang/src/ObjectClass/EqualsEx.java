package ObjectClass;

class  Student2{ //학생 클래스, 이름과 학번. 
	String name;
	int id;
	Student2(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override 
	public boolean equals(Object obj) { //equals 메서드 재정의. 논리적으로 같은 값인지 확인할 수 있도록, 학생의 학번이 같으면 true반환 
		if(obj instanceof Student2) {
			Student2 std=(Student2) obj; //다운 캐스팅 
		    if(this.id==std.id) return true; //학번이 같으면 true반환. 
		    else return false;
		}
		return false;
	}
	@Override
	public int hashCode() { //해시 코드 값으로 학생의 학번을 반환하도록 재정의.
		return id;
	}
}




public class EqualsEx {
//equls() : 두 인스턴스가 물리적으로 같은 지 확인하는 메서드. 재정의하면 논리적으로 같은 지 확인할 수 있다. 
	public static void main(String[] args) {
		
		Student2 s1=new Student2("James",100);
		Student2 s2=s1; //주소 복사 
		Student2 s3=new Student2("James",100); //값 복사
		
		if(s1==s2) System.out.println("1과 2의 주소는 같습니다."); //
		else  System.out.println("1과 2의 주소는 다릅니다.");
		
		if(s1.equals(s2)) System.out.println("1과 2는 같은 학생입니다.");
		else System.out.println("1과 2는 다른 학생입니다.");
		
		if(s1==s3) System.out.println("1과 3의 주소는 같습니다.");
		else  System.out.println("1과 3의 주소는 다릅니다.");
		
		if(s1.equals(s3)) System.out.println("1과 3은 같은 학생입니다.");
		else System.out.println("1과 3은 다른 학생입니다.");
		
		System.out.println("s1의 해시코드 :"+s1.hashCode());//여기서는 학번을 반환함 
		System.out.println("s3의 해시코드 :"+s3.hashCode());//여기서는 학번을 반환함 
		
		System.out.println("s1의 실제 주소 값 :"+System.identityHashCode(s1)); //두 인스턴스의 실제 주소 값-> 다름 
		System.out.println("s3의 실제 주소 값 :"+System.identityHashCode(s3));
		
		
	}
	

}

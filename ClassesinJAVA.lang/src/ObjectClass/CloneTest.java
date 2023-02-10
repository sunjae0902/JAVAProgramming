package ObjectClass;
//객체를 복제하는 clone()메서드 
class Point{ //원점 클래스 
	int x;
	int y;
	
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x= " + x +", y= "+y;
	}
	
}
class Circle implements Cloneable{ //하나의 원점과 반지름을 변수로 가지는 원 클래스. 객체를 복제해도 된다는 의미로 마커 인터페이스 cloneable 인터페이스 선언.
	Point point; 
	int radius;
	
	Circle(int x,int y, int radius){
		this.radius=radius;
		point=new Point(x,y);
	}
	public String toString() {
		return "원점은 "+point+"이고"+" 반지름은 "+radius+"입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{//해당 메서드를 사용할 때 발생할 수 있는 오류 처리.
		return super.clone(); //상위 클래스 객체를 복제함 
	}
}
public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle=new Circle(10,20,30);
		Circle cpycircle=(Circle) circle.clone(); //형변환 해야됨 
		
		System.out.println(circle);
		System.out.println(cpycircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cpycircle));

	}

}

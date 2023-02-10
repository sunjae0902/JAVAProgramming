package GenericMethod;

public class GenericMethod { //제네릭 메서드를 구현하여 두 점이 주어졌을 떄 만들어지는 사각형의 넓이를 계산하는 프로그램. 
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) { //자료형 매개변수를 가지는 제네릭 메서드 
		double left=((Number)p1.getX()).doubleValue();		//p1의 x좌표를 실수형으로 
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue(); //y좌표  
		double bottom=((Number)p2.getY()).doubleValue();
		
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}

	public static void main(String[] args) {
		Point<Integer,Double> p1=new Point<>(0,0.0); //컴파일러가 앞의 자료형을 보고 유추할 수 있으므로 생략가능 
		Point<Integer,Double> p2=new Point<Integer,Double>(10,10.0);
		
		double rect=GenericMethod.<Integer,Double>makeRectangle(p1,p2); //제네릭메서드 호출 . <>생략 가능 
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+" 입니다.");
		
	}

}

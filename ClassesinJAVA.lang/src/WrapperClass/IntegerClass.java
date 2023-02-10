package WrapperClass;


public class IntegerClass {
//Integer 클래스: 정수를 객체형으로  사용할 때. 문자열이나 정수를 생성자의 매개변수로 하고 호출하여 사용함.
	public static void main(String[] args) {
		
		
		Integer iValue=new Integer(100); //integer클래스로 정수 선언. 
		int myValue =iValue.intValue(); //intValue 메서드로 객체형에서 기본형 int 값을 가져올 수 있음
		
		Integer n1=Integer.valueOf("100");
		Integer n2=Integer.valueOf(100); //valueOf메서드로 생성자를 호출하지 않아도 정수나 문자열을 바로 integer 클래스로 반환받을 수 있음. 
	
		int n3=Integer.parseInt("100"); //문자열을 바로 정수로 가져와서 반환할 수 있음
	
		//오토박싱과 언박싱: 기본형에서 객체형으로 바꾸는 것을 오토박싱, 객체형에서 기본형으로 꺼내는 것을 언박싱이라함. 컴파일러가 알아서 변환하므로 자유롭게 사용할 수 있음
		Integer num1=new Integer(100);
		int num2=200;
		
		int sum= num1+num2;//언박싱 
		Integer num3=num2; //오토박싱 
		}
	

}

package ClassClass;

 import java.lang.reflect.Method;
//Constructor, Field, Method 사용 
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class StringClassTest {
	//Class 클래스를 활용해 String 클래스의 정보 가져오기. 리플렉션 
	public static void main(String[] args) throws ClassNotFoundException {
		Class strclass=Class.forName("java.lang.String");
		
		Constructor[] cons= strclass.getConstructors(); //모든 생성자를 가져옴. 
		for(Constructor c: cons) System.out.println(c);
		
		System.out.println( );
		Field[] fields=strclass.getFields(); //모든 멤버변수를 가져옴 
		for(Field f: fields) System.out.println(f);
		
		System.out.println( );
		Method[] methods=strclass.getMethods(); //모든 메서드를 가져옴 
		for(Method m: methods) System.out.println(m);
		
	
		
	}

}

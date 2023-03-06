package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//BinaryOperator를 구현한 클래스 정의 
class CompareString implements BinaryOperator<String>{
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length>=s2.getBytes().length) return s1;
		else return s2;
	}
}
public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings= {"안녕하세요~~~","hello","Good Morning","반갑습니다"};
		System.out.println(Arrays.stream(greetings).reduce(" ",(s1,s2)->{
			if(s1.getBytes().length>=s2.getBytes().length) 
				return s1;
			else return s2; //람다식을 직접 구현하여 길이가 긴 문자열을 반환함. 
		}));
		
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		//해당 인터페이스를 구현한 클래스를 사용한 코드 
		System.out.println(str);
	}

}

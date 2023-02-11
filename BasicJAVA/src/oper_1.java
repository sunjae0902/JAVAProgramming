package src.ch3;

public class oper_1 {
//ch3-연산자 
	public static void main(String[] args) {
		//단락 회로 평가 실습
		int num1=10;
		int i=2;
		
		boolean value=((num1=num1+10)<10) && ((i=i+2)<10); // 첫 항이 거짓이므로 둘째 항은 실행안됨 . 무조건 거짓 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value=((num1=num1+10)>10) || ((i=i+2)<10); //첫 항이 참이므로 둘째 항은 실행 안됨  . 무조건 참 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//비트 연산 
		//&연산(둘 다 1이어야 1)
		num1=5; int num2=10; 
		int result=num1&num2;
		System.out.println(result);  // 0000 0101 & 0000 1010-> 0000 0000
		
		//|연산(하나라도 1이면 1)
		 result=num1|num2;
		System.out.println(result);  // 0000 0101 | 0000 1010-> 0000 1111
		
		//^연산(같으면 0, 다르면 1)
		result=num1^num2;
		System.out.println(result);  // 0000 0101 ^ 0000 1010-> 0000 1111
		
		//~연산 (비트 반전)
		result=~num1;
		System.out.println(result);  // 0000 0101 ~-> 1111 1010 (-11)
		
		//비트 이동 연산자  
		//<<연산. 왼쪽으로 n비트만큼 이동. 0으로 채움
		System.out.println(num1<<2);  // 0000 0101 -> 0001 0100 = 2*n을 곱한 수 
		
	    //>>연산. 오른쪽으로 n비트만큼 이동. 부호비트로 채움 
		System.out.println(num2>>2);  // 0000 1010 -> 0000 0010 = 2*n을 나눈 수 
		
		//>>>연산. 오른쪽으로 이동하되 무조건 0으로 채
		System.out.println(num2>>>2);  // 위와 동일 
	}

}

package ch4;

public class practice {
//ch4-제어 흐름 (조건문, 반복문)
	public static void main(String[] args) {
		//연습문제1-사칙 연산 수행 프로그램 만들기
		int num1=10; int num2=2;
		char operator='+';
		switch(operator) {
			case '+': 
				System.out.println(num1+num2); 
				break;
			case '-': 
				System.out.println(num1-num2); 
				break;
			case '*': 
				System.out.println(num1*num2); 
				break;
			case '/': 
				System.out.println(num1/num2); 
				break;
		}
		
		//2- 구구단을 짝수단만 출력하기
		for (int i=2;i<=9;i+=2) {
			for (int j=1;j<=9;j++) 
				System.out.println(i+"*"+j+"="+i*j);
			System.out.println("\r");
			
		}
		
		//3-단보다 곱하는 수가 작거나 같을때까지 출력하기
		for (int i=2;i<=9;i++) {
			for (int j=1;j<=i;j++) 
				System.out.println(i+"*"+j+"="+i*j);
			System.out.println("\r");
			
		}
		//4-별 찍기
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) System.out.print(" ");
			for (int j=0;j<2*i+1;j++) System.out.print("*"); 
			for(int j=0;j<3-i;j++) System.out.print(" ");
			System.out.println("\r");
		}
		
		//5-다이아몬 찍기
				for(int i=0;i<4;i++) {
					for(int j=0;j<3-i;j++) System.out.print(" ");
					for (int j=0;j<2*i+1;j++) System.out.print("*"); 
					for(int j=0;j<3-i;j++) System.out.print(" ");
					System.out.println("\r");
				}
				//4-별 찍기
				for(int i=3;i>0;i--) {
					for(int j=0;j<4-i;j++) System.out.print(" ");
					for (int j=0;j<2*i-1;j++) System.out.print("*"); 
					for(int j=0;j<4-i;j++) System.out.print(" ");
					System.out.println("\r");
				}
			
		
		

	}

}

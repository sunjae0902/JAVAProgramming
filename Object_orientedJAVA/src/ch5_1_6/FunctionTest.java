package ch5_1_6;

public class FunctionTest {
	// 사칙 연산 함수 구현하고 호출해보기 
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		int sum=calculation(num1,num2,'+');
		System.out.println(num1+"+"+num2+"="+sum+"입니다 ");
		
		sum=calculation(num1,num2,'-'); 
		System.out.println(num1+"-"+num2+"="+sum+"입니다 ");
		
		sum=calculation(num1,num2,'*'); 
		System.out.println(num1+"*"+num2+"="+sum+"입니다 ");
		
		sum=calculation(num1,num2,'/'); 
		System.out.println(num1+"/"+num2+"="+sum+"입니다 ");
	}
	
	public static int calculation(int num1, int num2, char oper) { //사칙연산 함수 
		if(oper=='+') return (num1+num2);
		else if(oper=='-') return (num1-num2);
		else if(oper=='*') return (num1*num2);
		else return (num1/num2);
		
	}
	

}

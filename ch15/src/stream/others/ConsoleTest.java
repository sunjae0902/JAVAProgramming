package stream.others;

import java.io.Console; //콘솔 클래스 사용하기. 이클립스에서는 지원하지 않음 

public class ConsoleTest{
	public static void main(String[] args){
		Console cs=System.console(); //콘솔 클래스 반환

		System.out.println("이름: ");
		String name=cs.readLine();
		System.out.println("직업: ");
		String job=cs.readLine();

		System.out.println("비밀번호: ");
		char[] pwd= cs.readPassword();
		String strpwd=new String(pwd);

		System.out.println(name+" "+job+" "+strpwd);
	}
}



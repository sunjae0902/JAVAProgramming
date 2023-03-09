package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling { //try-catch 문 

	public static void main(String[] args) {
		try {
			//예외가 발생할 수 있는 부분 
			FileInputStream fis=new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			//파일이 존재하지 않는 에러가 발생했을 경우 예외를 처리할 부분 
			e.printStackTrace(); //어디에서 예외가 발생했는 지 알 수 있음 
		}
	} //프로그램이 어디에서 예외가 발생했는 지 알 수 있고, 프로그램의 비정상적인 종료를 막을 수 있음 

}

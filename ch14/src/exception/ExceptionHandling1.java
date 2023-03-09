package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		// try-catch-finally문 
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("a.txt"); //파일 열기 
			} catch(FileNotFoundException e){ //파일이 존재하지 않을 때 에러 발생 
				System.out.println(e);
				return; //프로그램이 강제종료되어도 finally문은 실행됨 
			}
		finally { //항상 수행할 코드 
			if(fis!=null) {
				try {
					fis.close(); //닫아주기 
				} catch(IOException e) { //에러가 발생할 경우 호출. 
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다. ");
		}
		System.out.println("여기도 수행됩니다 ");
		
	}

}

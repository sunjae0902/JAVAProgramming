package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
//파일에서 바이트 단위로 자료를 읽어 들일 떄 사용하는 FileInputStreamClass 사용해보기 
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis=null; //초기화 
		int i=0;
		try {
			fis=new FileInputStream("input.txt"); //파일 입력 스트림 생성, 파일이 존재하지 않으면 예외 발생 .
			while((i=fis.read())!=-1) { //파일의 끝까지 읽어 저장 
				System.out.println((char)i); // 끝에 도달하면 -1반환 
			}
	}
		catch(IOException e){ //예외가 발생할 경우 (파일이 존재하지 않음)
			e.printStackTrace();
	} 
		finally { //항상실행 
			try {
				fis.close();
			}
			catch(IOException e) { //NUllPointer예외의 최상위예외 클래스 .
				System.out.println(e);
			}
			catch(NullPointerException e) { //스트림이 Null인데 닫으려고 할 경우 해당 에러.  
				System.out.println(e);
			}
		}
		System.out.println("end"); //예외처리 덕분에 프로그램이 중단되지 않고 마지막까지 실행됨 
	}
}

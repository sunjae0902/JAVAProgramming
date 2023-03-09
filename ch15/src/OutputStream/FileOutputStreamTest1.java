package OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
//출력 스트림 사용해보기 
public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("output.txt",true)){
			fos.write(65);
			fos.write(66);
			fos.write(67); //숫자에 해당하는 아스키코드값이 출력된다. 
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}

}

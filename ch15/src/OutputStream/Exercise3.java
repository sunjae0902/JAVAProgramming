package OutputStream;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Exercise3 {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("a.txt");
			OutputStreamWriter osw=new OutputStreamWriter(fos)){
			osw.write("지금까지 자바 정말 재밌게 공부했습니다!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
		
	}

}

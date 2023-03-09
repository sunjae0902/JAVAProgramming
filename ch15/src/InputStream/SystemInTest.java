package InputStream;

import java.io.IOException;
//문자열 \n전까지 여러 개 입력받기. 
public class SystemInTest {

	public static void main(String[] args) throws IOException {
		int i;
		try {
			while((i=System.in.read())!='\n') { //개행문자를 입력할 때까지 입력한 문자들을 저장하고 문자로 출력함. 
				System.out.println((char)i);
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		

	}

}

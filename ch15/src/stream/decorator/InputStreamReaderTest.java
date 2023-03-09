package stream.decorator;

import java.io.IOException;
import java.io.FileInputStream; //바이트 단위로 읽는 스트림 
import java.io.InputStreamReader; //바이트를 문자로 변환해주는 스트림. 
public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt")))
		{
			int i;
			while((i=isr.read())!=-1) {
				System.out.print((char)i);
			}
			
		}
	catch(IOException e) {
		e.printStackTrace();
	}
		
	}

}
/* FileInputStream은 파일 내용을 바이트 단위로 읽기 때문에 한글로 된 파일을 읽을 수 없음.
따라서 바이트를 문자 단위로 변환해주는 InputStreamReader를 사용하여 제대로 읽어올 수 잇음. 
특히 네트워크에서 쓰이는 클래스는 스트림을 생성하면 Input/OutputStream으로 생성되므로 
해당 스트림을 사용해 문자로 변경해야 함 

*/
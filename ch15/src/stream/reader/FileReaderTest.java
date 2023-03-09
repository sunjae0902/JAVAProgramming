package stream.reader;
//문자 단위로 내용을 읽어오는 스트림. 

import java.io.FileReader;
import java.io.IOException;
public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("reader.txt")){
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

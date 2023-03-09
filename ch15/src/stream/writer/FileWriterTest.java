package stream.writer;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("writer.txt")){
			fw.write('A'); //문자 하나 출력 
			char buf[]= {'B','C','D','E'};
			
			fw.write(buf); //문자 배열 출력 
			fw.write("안녕하세요 "); //문자열 출력
			fw.write("65"); //문자 그대로 출력 
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료 ");
	}

}

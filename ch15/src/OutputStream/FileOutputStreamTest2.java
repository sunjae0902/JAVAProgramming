package OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
//파일에 바이트 배열로 출력하기-> 여러 자료를 한꺼번에 출력할 수 있음. 
public class FileOutputStreamTest2 {
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("output.txt",true)){
			byte[] bs=new byte [26];
			byte data=65;
			for(int i=0;i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			fos.write(bs); //배열을 한꺼번에 출력할 수 있음. 
		//fos.write(bs,2,10); -> 배열의 세번쨰 위치부터 10개의 바이트 출력. 
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}

}

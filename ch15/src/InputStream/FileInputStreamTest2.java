package InputStream;

import java.io.IOException;
import java.io.FileInputStream;
//byte 배열로 읽기 
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("input2.txt")){
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs))!=-1) {
				for(int k=0;k<i;k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": "+i+"바이트 읽음");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}

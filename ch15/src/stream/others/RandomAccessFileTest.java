package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException{
		RandomAccessFile rf=new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		//현재 파일 포인터 위치: 4+8+17=29
		rf.seek(0); //처음으로 옮김
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		
		int i=rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		//모두 읽은 후 다시 포인터 위치 출력 
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}

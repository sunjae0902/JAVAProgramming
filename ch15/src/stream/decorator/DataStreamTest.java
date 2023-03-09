package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//datastream테스트하기. 자료형을 유지하여 읽고씀. -> 자료를 읽을 때는 쓴 자료형과 같은 메서드로 읽어온다. 메서드 순서도 같게 사용한다. 
public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("data.txt");
			DataOutputStream dos=new DataOutputStream(fos)){
				dos.writeByte(100);		
				dos.writeChar('A');		
				dos.writeInt(10);		
				dos.writeFloat(100.0f);		
				dos.writeUTF("Test");
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("data.txt");
			DataInputStream dis=new DataInputStream(fis)){
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

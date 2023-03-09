package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Externalizable;
//입출력 기능을 프로그래머가 따로 구현해야하는 Externalizable 인터페이스를 구현 

class Dog implements Externalizable{
	String name;
	
	public Dog() {} //디폴트 생성자 
	//입출력 메서드 재정의 
	@Override
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeUTF(name);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
		in.readUTF( );
	}
	public String toString() {
		return name;
	}
	
	
}
public class ExternalizableTest {

	public static void main(String[] args) throws ClassNotFoundException,IOException {
		Dog dog=new Dog();
		dog.name="멍멍이 ";
		FileOutputStream fos=new FileOutputStream("external.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		try(fos;oos){
			oos.writeObject(dog);
		}catch(IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis=new FileInputStream("external.txt");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Dog dog1=(Dog)ois.readObject(); //복원. 디폴트 생성자 호출. 
			System.out.println(dog1);
		}
		

	}

}

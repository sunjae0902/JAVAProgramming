package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//직렬화(인스턴스 변수를 스트림으로 만들어 저장하거나 전송하기 위해 사용 

class Person implements Serializable{ //직렬화하겠다는 의미로 해당 마커 인터페이스를 추가함. 
	private static final long serialVersionUID=-1503252402544036183l;
	//-> 직렬/역직렬화 시 클래스의 버전을 관리하는 정보. 자동으로 생성되나 클래스가 변경되면 변함.   
	String name;
	String job; //특정 변수를 직렬화 하고싶지 않을 떄 transient 예약어 사용. 
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name=name;
		this.job=job;
	}
	public String toString() {
		return name+" "+job;
	}
}
public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p1=new Person("안재용","대표이사");
		Person p2=new Person("김재용","상무이사");
		try(FileOutputStream fos=new FileOutputStream("serial.out");
			ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(p1);
			oos.writeObject(p2); //현재 인스턴스 변수의값을 파일에 씀.(직렬화)
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("serial.out");
			ObjectInputStream ois=new ObjectInputStream(fis)){
			Person pp1=(Person)ois.readObject();
			Person pp2=(Person)ois.readObject(); //파일에서 가져옴. (역직렬화)
				//역 직렬화 시 클래스가 존재하지 않을 수 있으므로 main 메소드에 해당 예외 처리 
			System.out.println(pp1);
			System.out.println(pp2);
			}catch(IOException e) {
				e.printStackTrace();
			}
				
				
	}

}

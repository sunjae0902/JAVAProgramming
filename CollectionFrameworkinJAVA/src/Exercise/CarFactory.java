package Exercise;
import java.util.HashMap;
import java.util.Iterator;

public class CarFactory {
	
	private static CarFactory instance =new CarFactory(); //초기화 이후 인스턴스 생성.  
	HashMap <String,Car> hashmap=new HashMap<>(); //키: String(name) 값: Car. -> key는 중복이 안되므로 각 연수차들과 승연차들은 하나로 쳐짐. 
	
	
	private CarFactory() {} //디폴트 생성자. 초기화 이후 해당 클래스 내에서만 사용하므로 private으로 선언. 
	public static CarFactory getInstance() { 
		if(instance==null) instance=new CarFactory(); //instance가 초기 값일 때 인스턴스 생성.
		return instance;
	}
	
	public Car creatCar(String name) {   //매개변수로 전달된 value에 해당하는 키 값을 반환하는 메서드
		if(hashmap.containsKey(name)) { 
			return hashmap.get(name);

		}
		Car car=new Car();
		hashmap.put(name,car);
		return car;
	}


	
	
}

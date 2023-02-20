package Exercise;



public class CarFactoryTest { //hashmap자료형을 사용하여 구현하기 

	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance(); //carfactory 클래스에서 해시맵을 불러오는 역할. 
		Car sonata1=factory.creatCar("연수 차"); //key: name- value: car
		Car sonata2=factory.creatCar("연수 차");
		
		System.out.println(sonata1==sonata2); //true
		
		Car avante1=factory.creatCar("승연 차");
		Car avante2=factory.creatCar("승연 차");
		
		System.out.println(avante1==avante2);//true
		
		System.out.println(avante1==sonata1); //false
		
		
	}

}

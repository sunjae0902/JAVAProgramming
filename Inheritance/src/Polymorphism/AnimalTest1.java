package Polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다. ");
	}
}
class Human extends Animal{ //동물 클래스를 상속받는 3개의 하위 클래스 
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다. ");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다. ");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
	}
	public void moveAnimal(Animal animal) {//매개변수의 자료형이 상위 클래스 
		animal.move(); //재정의된 메서드 호출 
	}
	

}

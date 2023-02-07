package DownCastingExample;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다. ");
	}
}
class Human extends Animal{ //동물 클래스를 상속받는 3개의 하위 클래스 
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다. ");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다 ");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다. ");
	}
	public void flying() {
		System.out.println("독수리가 날개를 펴고 납니다. ");
	}
}

public class AnimalTest1 {
	ArrayList <Animal> aniList=new ArrayList <Animal>();

	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅 ");
		aTest.testCasting();
		
}
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i=0;i<aniList.size();i++) {
			Animal ani=aniList.get(i); //i번째 요소 반환 
			if(ani instanceof Human) {
				Human h=(Human)ani; //생성된 인스턴스의 원래 자료형이 'Human'이라면 human으로 다운 캐스팅 
			    h.read();
			}
			else if (ani instanceof Tiger) {
				Tiger t=(Tiger)ani;
				t.move();
			}
			else if (ani instanceof Eagle) {
				Eagle e=(Eagle)ani;
				e.move();
			}
			else System.out.println("지원되지 않는 형입니다.");
			
		}
	}
}

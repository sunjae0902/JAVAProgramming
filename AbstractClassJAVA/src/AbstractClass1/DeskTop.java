package AbstractClass1;

public class DeskTop extends Computer{ //추상 클래스를 상속받은 클래스도 추상메서드를 포함하므로, 해당 메서드를 구현하거나 추상 클래스로 선언해야함. 

	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
		
	}
	 
}
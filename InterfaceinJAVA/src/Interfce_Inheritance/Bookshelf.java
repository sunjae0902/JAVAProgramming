package Interfce_Inheritance;

public class Bookshelf extends Shelf implements Queue { //Shelf클래스를 상속받으면서 Queue인터페이스를 구현하는 클래스.
	@Override
	public void enQueue(String title) {
		shelf.add(title); //arraylist add 메서드 사용. 배열에 추가.
	}
	@Override
	public String deQueue() {
		return shelf.remove(0); //맨 처음 요소를 삭제하고 반환. 
	}
	@Override
	public int getSize() {
		return getCount(); //요소 개수 반환 
	}
	
 
}

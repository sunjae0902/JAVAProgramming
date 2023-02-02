package AbstractClass1;

public class MyNoteBook extends NoteBook { //notebook클래스를 상속받음. 나머지 메서드도 다 구현했으므로 추상 예약어를 붙이지 않는다. 
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}

}

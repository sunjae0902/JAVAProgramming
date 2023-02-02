package AbstractClass1;

public abstract class NoteBook extends Computer { //display()하나만 구현했으므로 추상 클래스임. 
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}

}

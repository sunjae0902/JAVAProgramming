package Interfce_Inheritance;
import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //자료를 순서대로 저장할 어레이리스트 변수 선언
	
	public Shelf() {
		shelf=new ArrayList<String>(); //디폴트 생성자 선언.-> 어레이 리스트 생성.
	}
	public  ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size(); //책장의 책 개수 반환.
		
	}

}

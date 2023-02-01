package Arraylist;
import java.util.ArrayList; //패키지 임포트 

public class ArraylistTest {
//ArrayList 클래스: 기존 배열의 단점을 보완하여 객체 배열을 쉽게 사용할 수 있도록 자바에서 제공하는 메서드. java.util 패키지에 구현. 
	public static void main(String[] args) {
		ArrayList<Book> library= new ArrayList<Book>(); //book클래스형 사용
		library.add(new Book("태백산맥","조정래 "));
		library.add(new Book("데미안 ","헤르만 헤세" ));
		library.add(new Book("어떻게 살 것인가 ","유시민 "));
		library.add(new Book("토지","박경리")); //add()메서드 : 기존 배열에 값을 추가 . 인스턴스를 생성하여 배열의 요소로 추
		
		for(int i=0;i<library.size();i++) {
			Book book=library.get(i);//인덱스i인 요소값 반환 
			book.showInfo(); //해당 요소값에서 정보 출력 
	}
		System.out.println( );
		System.out.println("향상된 for문 사용====");
		for(Book book:library) {
			book.showInfo();
		}

}
}

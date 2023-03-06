package Stream;
//q6 ->스트림을 사용하여 도서관 책 목록 출력하기 
import java.util.ArrayList;
import java.util.List;


class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
}


public class LibraryTest{
	public static void main(String[] args) {
		List<Book> bookList=new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		
		//스트림 생성 후 출력하기 
		int total=bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 비용은 "+total+"입니다");
		
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted()
		.forEach(s->System.out.println(s));
	
	}
}

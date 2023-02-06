package Interfce_Inheritance;

public class BookShelfTest {
	public static void main (String[] args) {
		Queue shelfQueue=new Bookshelf();
		
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue()); //가장 앞에 있는 요소부터 삭제 후 반환. (선입선출) 
	}

}

package Interfce_Inheritance;

public interface Queue { //책을 저장할 자료구조. 
	void enQueue(String title); //책 저장. 인큐 
	String deQueue(); //디큐. 맨 앞에 위치한 책 꺼내기.
	int getSize(); //책 개수 반환 

}

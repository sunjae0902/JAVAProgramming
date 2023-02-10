package Collection;


import java.util.LinkedList;

public class LinkedListTest {
//LinkedList 사용해보기 
	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList(); //linkedlist 생성 
		
		linkedlist.add("A");
		linkedlist.add("B");
		linkedlist.add("C");
		
		System.out.println(linkedlist);
		
		linkedlist.add(1,"D"); //요소 삽입
		System.out.println(linkedlist);
		linkedlist.add("0"); //맨 앞에 추가 
		System.out.println(linkedlist);
		System.out.println(linkedlist.removeLast()); //맨 마지막 요소를 삭제한 후 요소를 출력 
		System.out.println(linkedlist);
		
		
	}

}

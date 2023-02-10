package Collection.arraylist;

import java.util.ArrayList; //arraylist로 큐 구현하기

class MyQueue{
	private ArrayList<String> arrayQueue=new ArrayList();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		if(len==0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		
		return arrayQueue.remove(0); //맨 앞의 요소를 제거하고 반환. 
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}

}

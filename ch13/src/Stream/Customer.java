package Stream;

public class Customer { //이름, 나이, 비용이 멤버변수인 고객 클래스 
	private String name;
	private int age;
	private int cost;
	
	public Customer(String name, int age, int cost) {
		this.name=name;
		this.age=age;
		this.cost=cost;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getCost() {
		return cost;
	}
	
	public String toString() {
		return "name: "+name+"age: "+age+"cost: "+cost;
	}
	
	
}

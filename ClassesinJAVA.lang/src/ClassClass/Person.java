package ClassClass;
//Class 클래스: 클래스의 정보를 몰라 직접 찾아야 할 때 사용하는 클래스. 
public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name) {
		this.name=name;
}

	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public String getName() { return name;}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge( ) {return age;}
	
	public void setAge(int age) { this.age=age;}
}
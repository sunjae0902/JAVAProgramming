package GenericClass;



public class GenericPrinter<T extends Material>  { //여러 자료형이 사용될 수 있는 제네릭 클래스. 프린터에 사용 될 재료가 제네릭 자료형으로 선언됨. extends: 사용할 수 있는 자료형에 제한을 둠. (Material 클래스를 상속받은 클래스만 재료로 사용 가능)
	private T material; //클래스의 인스턴스 변수. 
	
	public void setMaterial(T material) {
		this.material=material;
	}
	
	public T getMaterial() { return material;} //자료형이 T인 변수 material을 반환하는 제네릭 메서드.
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); //상위 클래스 Material의 메서드 호출
	}
	
}

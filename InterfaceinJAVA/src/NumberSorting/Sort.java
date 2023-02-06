package NumberSorting;
//숫자를 다양한 정렬 알고리즘으로 정렬할 때, 해당 알고리즘이 구현해야 할 내용을 정의해둘 인터페이스. 
public interface Sort {
	//오름차순정렬
	public void ascending(int arr[]);
	//내림차순정렬
	public void descending(int arr[]);
	//알고리즘 설명 , 디폴트 메서드 
	default void description() {
		description();
	}

}

package Array;

public class EnhancedForloop {
//향상된 for문 사용하기. 배열의 처음 요소부터 마지막 요소까지 참조할때 사용. 
	public static void main(String[] args) {
		String[] strArray= {"Java ","Android ","C","JavaScript","Python"};
		for (String lang:strArray) {
			System.out.println(lang); //lang변수에 배열의 각 요소가 대입.
		}

	}

}

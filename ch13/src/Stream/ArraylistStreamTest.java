package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArraylistStreamTest {

	public static void main(String[] args) {
		// ArrayList에서 stream 활용하기. 
		
		List<String> sList=new ArrayList<String>(); //어레이리스트 생성 
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream=sList.stream(); //스트림 생성 
		stream.forEach(s-> System.out.print(s+" "));
		
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		//또 다른 스트림을 생성한 후 정렬하여 하나씩 출력 
	}

}

package Stream;
import java.util.Arrays; //정수 배열에 스트림 생성하고 사용하기 
public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int sumval=Arrays.stream(arr).sum(); //모든 요소의합을 반환. 
		int count=(int)Arrays.stream(arr).count(); //배열에 저장된 요소의 개수 반환
		
		System.out.println(sumval);
		System.out.println(count);
	}

}

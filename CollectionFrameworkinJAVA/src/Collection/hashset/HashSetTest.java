package Collection.hashset;

import java.util.HashSet; //hashset 임포트 

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>(); //순서 상관없이 중복을 허용하지 않는 HashSet 자료구조 
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬")); //중복된 값은 추가되지 않음 , 추가된 순서와 상관없이 출력됨 
		
		System.out.println(hashSet);
		
		
		
		
		
	}

	

	}


package Array;

public class ArraycopyExample {
//System.arraycopy(src,srcPos,dest,destPos,length) 사용예제 ->배열 복사하기 
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {1,2,3,4,5};
		
		System.arraycopy(arr1,0,arr2,1,4); //소스, 소스의 처음위치,목적배열, 목적배열의 위치, 붙일 요소의 개수
		for(int i=0;i<arr2.length;i++) System.out.println(arr2[i]);

	}

}

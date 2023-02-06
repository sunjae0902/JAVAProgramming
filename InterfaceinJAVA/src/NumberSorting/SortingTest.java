package NumberSorting;

import java.io.IOException;

public class SortingTest {

	public static void main(String[] args) throws IOException{
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("M: Merge Sort ");
		System.out.println("B: Bubble Sort");
		System.out.println("Q: Quick Sort");
		
		int ch=System.in.read();
		Sort sort=null;
		
		if (ch=='M'||ch=='m') sort=new MergeSort();
		else if (ch=='b'||ch=='B') sort=new BubbleSort();
		else if (ch=='Q'||ch=='q') sort= new QuickSort();
		else {
			System.out.println("지원하지 않는 기능입니다");
			return;
		}
		int[] arr= {6,12,3,2,1,7,8,4,5,10};
		sort.ascending(arr);
		for(int i:arr)
			System.out.print(i+" ");
		System.out.print("\r");
		sort.descending(arr);
		for(int i:arr)
			System.out.print(i+" ");
		sort.description();

	}

}

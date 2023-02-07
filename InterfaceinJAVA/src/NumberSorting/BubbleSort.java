package NumberSorting;

public class BubbleSort extends Swap implements Sort  {
	
	
	@Override
	public void ascending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) swap(i,j,arr);
			}
		}
	}
	@Override
	public void descending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]<arr[j]) swap(i,j,arr);
			}
		}
		
	}
	@Override
	public void description() {
		System.out.println("\r숫자를 정렬하는 Bubblesort 알고리즘 입니다.\r시간 복잡도는 O(N^2)입니다.");
	}

}

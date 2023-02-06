package NumberSorting;

public class BubbleSort implements Sort {
	
	private void swap(int a, int b,int[] arr) {
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
	}
	
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
		System.out.println("\r숫자를 정렬하는 Bubblesort 알고리즘 입니다.");
	}

}

package NumberSorting;

public class QuickSort extends Swap implements Sort {
	@Override
	public void ascending(int[] arr) {
		QuicksortinAscen(arr,0,arr.length-1);
		}
	@Override
	public void descending(int[] arr) {
		QuicksortinDescen(arr,0,arr.length-1);
	}
	@Override
	public void description() {
		System.out.println("\r숫자를 정렬하는 Quicksort 알고리즘 입니다\r시간 복잡도는 O(NlgN)입니다.");
	}
	
	
	public void QuicksortinAscen(int[] arr,int left, int right) {//오름차순 
		if (left >=right) return;
	        int pv = left;
	        int i = left + 1;
	        int j = right;

	        while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
	            while (i <= right && arr[i] < arr[pv]) { // 피봇 값보다 큰 값을 만날 때 까지
	                i++;
	            }
	            while (j > left && arr[j] > arr[pv]) { // 피봇 값보다 작은 값을 만날 때 까지
	                j--;
	            }
	            if (i > j) { // 현재 엇갈린 상태라면
	               swap(pv,j,arr);
	            } else {
	               swap(i,j,arr);
	            }
	        }
	        QuicksortinAscen(arr,left,j-1);
	        QuicksortinAscen(arr,j+1,right);
	    }
	
	
	public void QuicksortinDescen(int[] arr,int left, int right) {//내림차순 
		if (left >=right) return;
        int pv = left;
        int i = left + 1;
        int j = right;

        while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
            while (i <= right && arr[i] > arr[pv]) { // 피봇 값보다 작은 값을 만날 때 까지
                i++;
            }
            while (j > left && arr[j] < arr[pv]) { // 피봇 값보다 큰 값을 만날 때 까지
                j--;
            }
            if (i > j) { // 현재 엇갈린 상태라면
               swap(pv,j,arr);
            } else {
               swap(i,j,arr);
            }
        }
        QuicksortinDescen(arr,left,j-1);
        QuicksortinDescen(arr,j+1,right);
		
	}


}

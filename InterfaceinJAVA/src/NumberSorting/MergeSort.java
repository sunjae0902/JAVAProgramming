package NumberSorting;

public class MergeSort implements Sort {
	int[] temp=new int[10];
	@Override
	public void ascending(int[] arr) {
		MergesortinAscen(arr,0,arr.length);
		
	}
	@Override
	public void descending(int[] arr) {
		MergesortinDescen(arr,0,arr.length);
	}
	@Override
	public void description() {
		System.out.println("\r숫자를 정렬하는 Mergesort 알고리즘 입니다.");
	}
	
	public void MergesortinAscen(int[] arr, int left, int right) { //mergersort 알고리즘(오름차순)  구현
		int mid=(left+right)/2;
		int cmpleft=left, cmpright=(left+right)/2;
		int cpyind=left;
		
		if(mid-left>1) MergesortinAscen(arr,left,mid);
		if(right-mid>1) MergesortinAscen(arr,mid,right);
		
		while(cmpleft<mid && cmpright<right) {
			if (arr[cmpleft]>arr[cmpright]) temp[cpyind++]=arr[cmpright++];
			else  temp[cpyind++]=arr[cmpleft++];
		}
		while (cmpleft<mid) {
	        temp[cpyind++]=arr[cmpleft++];
	    }
	    while (cmpright<right) {
	        temp[cpyind++]=arr[cmpright++];
	    }
	    for(int i=left;i<right;i++)
	        arr[i]=temp[i];
		
	}
	
	public void MergesortinDescen(int[] arr, int left, int right) { //mergersort 알고리즘(내림차순)  구현
		int mid=(left+right)/2;
		int cmpleft=left, cmpright=(left+right)/2;
		int cpyind=left;
		
		if(mid-left>1) MergesortinDescen(arr,left,mid);
		if(right-mid>1) MergesortinDescen(arr,mid,right);
		
		while(cmpleft<mid && cmpright<right) {
			if (arr[cmpleft]>arr[cmpright]) temp[cpyind++]=arr[cmpleft++];
			else  temp[cpyind++]=arr[cmpright++];
		}
		while (cmpleft<mid) {
	        temp[cpyind++]=arr[cmpleft++];
	    }
	    while (cmpright<right) {
	        temp[cpyind++]=arr[cmpright++];
	    }
	    for(int i=left;i<right;i++)
	        arr[i]=temp[i];
		
	}

}

package TwoDimension;

public class TwoDimensionExample {
//2차원 배열 사용하기-> 알파벳 소문자를 13행 2열로 출력하기  
	public static void main(String[] args) {
		char [][]arr= new char[13][2]; //2차원 배열 선언과 동시에 초기화.
		char c='a';
		for(int i=0;i<arr.length;i++) { //row 
			for(int j=0;j<arr[i].length;j++)  //col 
				arr[i][j]=c++;
			
		}
		for(int i=0;i<arr.length;i++) { //row 
			for(int j=0;j<arr[i].length;j++) { //col 
				System.out.print(arr[i][j]+" ");}
			System.out.println();
			
		}
		

	}

}

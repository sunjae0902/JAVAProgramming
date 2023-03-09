package stream.others;
import java.util.Scanner;
//Scanner 클래스를 활용하여 표준 입력에서 다양한 자료를 읽어온 후 출력해보기
//콘솔 화면 뿐만 아니라 파일이나 문자열을 생성자의 매개변수로 받아 읽을 수도 있음. 
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //표준 입력 
		
		System.out.println("이름: ");
		String name= sc.nextLine();
		System.out.println("직업: ");
		String job= sc.nextLine();
		System.out.println("사번: ");
		int ID= sc.nextInt();
		
		System.out.println(name+" "+job+" "+ID);
	}

}

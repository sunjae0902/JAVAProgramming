package Date;

public class MydateTest {

	public static void main(String[] args) {
		Mydate date1=new Mydate(30,2,2000); //생성자 호출과 동시에 초기화 
		System.out.println(date1.isValid());
		Mydate date2=new Mydate(2,10,2006); //생성자 호출과 동시에 초기화 
		System.out.println(date2.isValid());
		
	}

}

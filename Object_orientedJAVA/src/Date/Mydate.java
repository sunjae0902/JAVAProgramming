package Date;

public class Mydate {
	private int day,month,year;
	
	public Mydate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public boolean isValid(){
		if (month==2 && (day<1 ||day>28)) {
			System.out.println("유효하지 않은 날짜입니다" );
			return false;
		}
		
		else {
			System.out.println("유효한 날짜입니다" );
			return true;
		}
			
	}
	
	
}

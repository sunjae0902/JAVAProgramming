package Collaboration;

public class Starbucks {
	String menu[]= {"아메리카노 ","카페라떼 ","초코라떼 ","녹차라떼 "};
	int price[]= {4000,4500,4500,5000};
	
	public void showMenu() {
		for (int i=0;i<4;i++) {
			System.out.println((i+1)+". "+menu[i]+price[i]+"원 ");
		}
	}
	

}

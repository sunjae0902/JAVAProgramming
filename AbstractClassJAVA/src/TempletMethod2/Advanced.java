package TempletMethod2;

public class Advanced extends Playerlevel{
	@Override
	public void run() {
		System.out.println("빠르게 달릴 수 있습니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("턴을 사용할 수 없습니다.");
	}
	@Override
	public void showLevelmessage() {
		System.out.println("===중급자 레벨입니다===");
	}
	


}

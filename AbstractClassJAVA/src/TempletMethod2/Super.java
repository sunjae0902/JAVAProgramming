package TempletMethod2;

public class Super extends Playerlevel {
	@Override
	public void run() {
		System.out.println("아주 빨리 달릴 수 있습니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 높이 jump할 수 있습니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("한 번 turn합니다.");
	}
	@Override
	public void showLevelmessage() {
		System.out.println("===고급자 레벨입니다===");
	}
	


}

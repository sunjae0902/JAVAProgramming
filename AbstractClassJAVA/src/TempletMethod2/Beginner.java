package TempletMethod2;

public class Beginner extends Playerlevel {
	@Override
	public void run() {
		System.out.println("천천히 달릴 수 있습니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("점프를 사용할 수 없습니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("턴을 사용할 수 없습니다.");
	}
	
	@Override
	public void showLevelmessage() {
		System.out.println("===초급자 레벨입니다===");
	}
	

}

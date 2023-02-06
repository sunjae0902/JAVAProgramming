package TempletMethod2;

public abstract class Playerlevel { //각 플레이어마다 레벨이 존재하고 레벨에 따라 수행 기능이 달라지므로, Player클래스에서 해당 클래스형을 멤버 변수로 가지도록 구현하고 해당 클래스를 추상 클래스로 구현한다. 
	public abstract void run();
	public abstract void jump(); 
	public abstract void turn();
	public abstract void showLevelmessage(); //추상 메서드 선언. 
	
	final public void go(int count) {
		run();
		for(int i=0;i<count;i++) jump(); //매개변수로 전달된 만큼 반복하여 출력. 
		turn();
	}
	
	
}

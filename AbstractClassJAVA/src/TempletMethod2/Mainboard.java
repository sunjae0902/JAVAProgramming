package TempletMethod2;

public class Mainboard {
//Player클래스를 상속받은 beginner, advanced, super 레벨마다 사용할 수 있는 게임 역할 정하기.
	public static void main(String[] args) {
		
		Player player=new Player(); //처음 생성하면 비기너 클래스. 
		player.play(1);
		
		Advanced aLevel=new Advanced();
		player.UpgradeLevel(aLevel); //비기너->중급으로 업그레이드.
		player.play(2);
		
		Super sLevel=new Super();
		player.UpgradeLevel(sLevel); //중급->고급으로 업그레이드.
		player.play(3);
		
		
		

	}

}

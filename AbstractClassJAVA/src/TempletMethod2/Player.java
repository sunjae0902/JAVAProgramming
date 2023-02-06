package TempletMethod2;

public class Player {
	private Playerlevel level; //player가 가지는 레벨 변수 선언. 
	
	public Player () {
		level=new Beginner();//디폴트 생성자. 처음 생성되면 비기너 레벨로 시작하여 레벨 메시지 출력.
		level.showLevelmessage();
	}
	
	public Playerlevel getLevel() {
		return level;
	}
	
	public void UpgradeLevel(Playerlevel level) { //매개변수로 전해진 레벨로 업그레이드.
		this.level=level;
		level.showLevelmessage();
	}
	public void play(int cnt) {
		level.go(cnt); //PlayerLevel 클래스의 템플릿메서드 go호출.
	}

}

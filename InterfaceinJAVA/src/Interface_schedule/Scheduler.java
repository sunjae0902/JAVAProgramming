package Interface_schedule;

public interface Scheduler { //고객 상담 전화 배분 프로그램-인터페이스 구현: 1)순서 배분 2)짧은 대기열 찾아 배분 3) 우선순위(업무능력)에 따라 배분. 3가지 시나리오에서 공통으로 사용하는 메서드 선언.
	public void getNextCall(); //다음 전화를 가져오는 기능
	public void sendCallToAgent(); //상담원에게 전화를 배분하는 기능
	

}

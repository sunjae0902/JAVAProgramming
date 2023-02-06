package Interface_schedule;

public class RoundRobin implements Scheduler { //시나리오 1. 순서대로 배분하기
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 전화를 배분합니다.");
	}

}

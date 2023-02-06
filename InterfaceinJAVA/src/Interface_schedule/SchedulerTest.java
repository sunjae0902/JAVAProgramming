package Interface_schedule;

import java.io.IOException;

public class SchedulerTest {
//사용자가 문자 하나를 입력하면 그 입력 문자에 따라 배분 정책을 결정하고 실행하는 프로그램.
	public static void main(String[] args) throws IOException{ //문자를 입력받는 메서드를 사용하려면 에러 처리 필요.
		 System.out.println("전화 상담 할당 방식을 선택하세요.");
		 System.out.println("R: 한명씩 차례로 할당 ");
		 System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		 System.out.println("P: 우선순위가 높은 고객 먼저 할당 ");
		 System.out.println("A: 전화 가져오기");
		 
		int ch=System.in.read();
		Scheduler scheduler=null; //인스턴스를 생성할 수 없으므로 null값 저장.
		
		
		if(ch=='R'||ch=='r') scheduler=new RoundRobin(); //사용자가 입력한 문자에 따라 맞는 배분 정책을 할당함.
		else if(ch=='L'||ch=='l') scheduler=new LeastJob();
		else if (ch=='P'||ch=='p') scheduler=new PriorityAllocation();
		else if (ch=='A'||ch=='a')  scheduler=new AgentGetCall(); //상담원이 원할 때 가져오는 정책 추가. 
		else {
			System.out.println("지원되지 않는 기능입니다 ");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}

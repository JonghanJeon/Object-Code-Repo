package Ch01.entity;

/**
 * 소극장을 구현하는 클래스
 */
public class Theater {
	private TicketSeller ticketSeller;

	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	/*
	Theater클래스는 ticketOffice가 TicketSeller 내부에 존재한다는 사실을 알지 못한다.
	단지 ticketSeller가 sellTo 메시지를 이해하고 응답할 수 있다는 사실만 알고 있을 뿐이다.
	Theater는 오직 TicketSeller의 인터페이스(interface)에만 의존한다.
	TicketSeller가 내부에 TicketOffice인스턴스를 포함하고 있다는 사실은 구현(implementation)의 영역에 속한다.
	 */
	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}
}

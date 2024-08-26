package ch01.entity;

/**
 * 매표소에서 초대장을 티켓으로 교환해 주거나 티켓을 판매하는 역할을 하는 판매원 클래스
 */
public class TicketSeller {
	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	/*
	ticketOffice의 가시성이 private이고 접근 가능한 퍼블릭 메서드가 더 이상 존재하지 않기 때문에
	외부에서는 ticketOffice에 직접 접근할 수 없다.
	결과적으로 ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 된다.
	이처럼 개념적이나 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 캡슐화(encapsulation)라고 한다.
	 */
	// public TicketOffice getTicketOffice() {
	// 	return ticketOffice;
	// }

	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}
}

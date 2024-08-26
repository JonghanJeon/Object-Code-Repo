package ch01.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 판매하거나 교환해 줄 티켓의 목록과 판매 금액을 인스턴스 변수로 포함
 */
public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	/*
		... : 가변 인자. tickets 는 Ticket 배열로 처리 된다.
	 */
	public TicketOffice(Long amount, Ticket... tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}

	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}

	public Ticket getTicket() {
		return tickets.remove(0);
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}

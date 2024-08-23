package Ch01.entity;

import java.util.logging.Logger;

/**
 * 관람객이 소지품을 보관할 Bag 클래스
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	/*
		당첨자: 현금과 초대장을 함께 보관
		미당첨자: 현금만 보관
		제약을 강제할 수 있도록 생성자 추가
	 */
	public Bag(long amount) {
		this(null, amount);
	}

	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}

	public boolean hasInvitation() {
		return invitation != null;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}

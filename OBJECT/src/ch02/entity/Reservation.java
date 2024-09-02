package ch02.entity;

import ch04.dataMain.entity.Customer;

/**
 * 고객(customer)
 * 상영 정보(screening)
 * 예매 요금(fee)
 * 인원 수(audienceCount)
 */
public class Reservation {
	private Customer customer;
	private Screening screening;
	private Money fee;
	private int audienceCount;

	public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
		this.customer = customer;
		this.screening = screening;
		this.fee = fee;
		this.audienceCount = audienceCount;
	}
}

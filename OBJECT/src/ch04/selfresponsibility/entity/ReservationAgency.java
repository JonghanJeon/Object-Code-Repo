package ch04.selfresponsibility.entity;

import ch04.dataMain.entity.Customer;
import ch04.dataMain.entity.Money;

public class ReservationAgency {
	public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
		Money fee = screening.calculateFee(audienceCount);
		return new Reservation(customer, screening, fee, audienceCount);
	}
}

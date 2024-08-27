package ch02.entity.discount;

import ch02.entity.Money;
import ch02.entity.Screening;

public interface DiscountPolicy {
	Money calculateDiscountAmount(Screening screening);
}

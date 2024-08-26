package ch02.entity.discount;

import ch02.entity.Screening;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}

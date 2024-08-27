package ch02.entity.discount;

import ch02.entity.Money;
import ch02.entity.Screening;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {
	private Money discountAmount;

	public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}

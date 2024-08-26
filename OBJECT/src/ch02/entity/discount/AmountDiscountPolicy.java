package ch02.entity.discount;

import ch02.entity.Money;
import ch02.entity.Screening;

public class AmountDiscountPolicy extends DiscountPolicy{
	private Money discountAmount;

	public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}

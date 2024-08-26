package ch02.entity.discount;

import ch02.entity.Money;
import ch02.entity.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
	private double percent;

	public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}

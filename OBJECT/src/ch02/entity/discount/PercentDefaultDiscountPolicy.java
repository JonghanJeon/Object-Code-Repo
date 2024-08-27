package ch02.entity.discount;

import ch02.entity.Money;
import ch02.entity.Screening;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
	private double percent;

	public PercentDefaultDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}

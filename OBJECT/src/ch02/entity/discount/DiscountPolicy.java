package ch02.entity.discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ch02.entity.Money;
import ch02.entity.Screening;

/**
 * 금액 할인 정책, 비율 할인 정책 클래스 사이의 중복 코드를 제거하기 위한 추상 클래스
 */
public abstract class DiscountPolicy {
	private List<DiscountCondition> conditions = new ArrayList<>();

	public DiscountPolicy(DiscountCondition ... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	public Money calculateDiscountAmount(Screening screening) {
		for (DiscountCondition each : conditions) {
			// isSatisfiedBy : Screening이 할인 조건을 만족시키면 true 아니면 false
			if (each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}

		return Money.ZERO;
	}

	abstract protected Money getDiscountAmount(Screening screening);
}

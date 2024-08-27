package ch02.entity.discount;

import ch02.entity.Money;
import ch02.entity.Screening;

/**
 * NoneDefaultDiscountPolicy는 getDiscountAmount() 가 어떤 값을 반환하더라도 상관이 없다는 사실을 알 수 있따.
 * DiscountPolicy에서 할인 조건이 없을 경우에는 getDiscountAmount()를 호출하지 않기 때문이다.
 * 이에 따라 DiscountPolicy를 따로 interface로 구현하고
 * 기존의 DiscountPolicy는 DefaultDiscountPolicy로 이름을 바꾸어 DiscountPolicy를 구현하도록 한다.
 */
public class NoneDefaultDiscountPolicy implements DiscountPolicy {
	@Override
	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}

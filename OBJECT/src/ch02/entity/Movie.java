package ch02.entity;

import java.time.Duration;

import ch02.entity.discount.DefaultDiscountPolicy;
import ch02.entity.discount.DiscountPolicy;

public class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	// 정책은 하나만, 조건은 여러개 가능
	private DiscountPolicy discountPolicy;

	public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}

	public Money getFee() {
		return fee;
	}

	public Money calculateMovieFee(Screening screening) {
		//이 방식의 문제점은 할인 정책이 없는 경우를 예외 케이스로 취급한다.
		// = 일관성 있던 협력 방식이 무너진다.
		/*if (discountPolicy == null) {
			return fee;
		}*/

		/**
		 * 기존의 Movie 와 DiscountPolicy는 수정하지 않고
		 * NoneDiscountPolicy 라는 새로운 클래스를 추가하는 것만으로
		 * 애플리케이션의 기능을 확장!!
		 */

		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}

	public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}
}

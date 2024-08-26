package ch02.entity;

import java.time.Duration;

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
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
}

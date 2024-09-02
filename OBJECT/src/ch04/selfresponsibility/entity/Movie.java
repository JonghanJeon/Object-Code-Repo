package ch04.selfresponsibility.entity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import ch04.dataMain.entity.DiscountConditionType;
import ch04.dataMain.entity.Money;
import ch04.dataMain.entity.MovieType;

public class Movie {
	/**
	 * Movie가 어떤 데이터를 포함해야 하는가?
	 */
	private String title;
	private Duration runningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;

	private MovieType movieType;
	private Money discountAmount;
	private double discountPercent;

	/**
	 * 이 데이터를 처리하기 위해 어떤 오퍼레이션이 필요한가
	 */

	public MovieType getMovieType() {
		return movieType;
	}

	public Money calculateAmountDiscountedFee() {
		if (movieType != MovieType.AMOUNT_DISCOUNT) {
			throw new IllegalArgumentException();
		}

		return fee.minus(discountAmount);
	}

	public Money calculatePercentDiscountedFee() {
		if (movieType != MovieType.PERCENT_DISCOUNT) {
			throw new IllegalArgumentException();
		}

		return fee.minus(fee.times(discountPercent));
	}

	public Money calculatedNoneDiscountedFee() {
		if (movieType != MovieType.NONE_DISCOUNT) {
			throw new IllegalArgumentException();
		}

		return fee;
	}

	public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
		for (DiscountCondition condition : discountConditions) {
			if (condition.getType() == DiscountConditionType.PERIOD) {
				if (condition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime())) {
					return true;
				}
			} else {
				if (condition.isDiscountable(sequence)) {
					return true;
				}
			}
		}

		return false;
	}
}

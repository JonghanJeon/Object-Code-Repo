package ch04.selfresponsibility.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;

import ch04.dataMain.entity.DiscountConditionType;

public class DiscountCondition {
	private DiscountConditionType type;
	private int sequence;
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;

	public DiscountConditionType getType() {
		return type;
	}

	public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
		if (type != DiscountConditionType.PERIOD) {
			throw new IllegalArgumentException();
		}

		return this.dayOfWeek.equals(dayOfWeek) &&
			!this.startTime.isAfter(time) &&
			!this.endTime.isBefore(time);
	}

	public boolean isDiscountable(int sequence) {
		if (type != DiscountConditionType.SEQUENCE) {
			throw new IllegalArgumentException();
		}

		return this.sequence == sequence;
	}
}

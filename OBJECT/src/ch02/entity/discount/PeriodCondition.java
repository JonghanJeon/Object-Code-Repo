package ch02.entity.discount;

import java.time.DayOfWeek;
import java.time.LocalTime;

import ch02.entity.Screening;

/**
 * 조건에 사용할 요일(dayOfWeek)
 * 시작 시간(startTime)
 * 종료 시간(endTime)
 * isSatisfiedBy 메서드는 인자로 전달된 Screening의 상영 요일이 dayOfWeek과 같고 상영 시작 시간이 startTime 과 endTime 사이에 있을 경우 true를 반환
 */
public class PeriodCondition implements DiscountCondition {
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
			startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
			endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
	}
}

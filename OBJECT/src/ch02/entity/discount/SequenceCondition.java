package ch02.entity.discount;

import ch02.entity.Screening;

/**
 * 할인 여부를 판단하기 위해 사용할 순번(sequence)를 인스턴스 변수로 포함
 * isSatisfiedBy 메서드는 파라미터로 전달된 Screening의 상영 순번과 일치할 경우 할인 가능한 것으로 판단.
 */
public class SequenceCondition implements DiscountCondition{
	private int sequence;

	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}
}

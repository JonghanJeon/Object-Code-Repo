package ch02.entity;

import java.time.LocalDateTime;

/**
 * 상영할 영화(movie)
 * 순번(sequence)
 * 상영 시작 시간(whenScreened)
 * 상영 시작 시간을 반환하는 getStartTime 메서드
 * 순번의 일치 여부를 검사하는 isSequence 메서드
 * 기본 요금을 반환하는 getMovieFee 메서드
 */
public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}

	public LocalDateTime getStartTime() {
		return whenScreened;
	}

	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	public Money getMovieFee() {
		return movie.getFee();
	}

	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}

	private Money caculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
}

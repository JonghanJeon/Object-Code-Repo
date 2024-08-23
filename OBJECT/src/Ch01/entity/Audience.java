package Ch01.entity;

/**
 * 관람객 클래스
 */
public class Audience {
	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	public Bag getBag() {
		return bag;
	}

	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}
}

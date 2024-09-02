package ch04.encapsulation04code;

public class Rectangle {
	private int left;
	private int top;
	private int right;
	private int bottom;

	public Rectangle(int left, int top, int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	/**
	 * Rectangle을 변경하는 주체를 외부의 객체에서 Rectangle로 이동시켰다.
	 * 즉, 자신의 크기를 Rectangle 스스로 증가시키도록 '책임을 이동' 시킨 것이다.
	 * 이것이 바로 객체가 자기 스스로를 책임진다는 말의 의미이다.
	 */
	public void enlarge(int multiple) {
		right *= multiple;
		bottom *= multiple;
	}
}

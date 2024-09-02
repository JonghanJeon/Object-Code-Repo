package ch04.encapsulation04code;

/**
 * 사각형의 너비와 높이를 증가시키는 코드가 필요하다고 가정.
 * 아마 이 코드는 Rectangle 외부의 어떤 클래스 안에 다음과 같이 구현
 * - 코드 중복이 발생할 확률이 높다.
 * 		- 다른 곳에서도 사각형의 너비와 높이를 증가시키는 코드가 필요하다면
 * 		그곳에도 getRight와 getBottom 메서드를 호출해서 right와 bottom을 가져온 후
 * 		수정자 메서드를 사용해 값을 설정하는 유사한 코드가 존재할 것이다.
 * 	- 변경에 취약하다.
 * 		- 접근자와 수정자는 내부 구현을 인터페이스의 일부로 만들기 때문에
 * 		현재의 Rectangle 클래스는 int 타입의 top, left, right, bottom이라는
 * 		4가지 인스턴스 변수의 존재 사실을 인터페이스를 통해 외부에 노출시키게 된다.
 * 		- right와 bottom 대신 length와 height를 사용하게 된다면,
 * 		getter 와 setter 는 모두 변경해야 하고, 이는 기존 접근자 메서드를 사용하던 모든 코드에 영향을 미친다.
 */
public class AnyClass {
	void anyMethod(Rectangle rectangle, int multiple) {
		rectangle.setRight(rectangle.getRight() * multiple);
		rectangle.setBottom(rectangle.getBottom() * multiple);
	}
}

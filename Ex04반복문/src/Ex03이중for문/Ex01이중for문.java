package Ex03이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {

		// 이중 for문을 사용해서 2단 ~ 9단 출력

		for (int i = 2; i < 10; i++) {
			System.out.printf("%d단 ", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d ", i, j, i * j);
			}
			System.out.println();

			// 지역변수 VS 전역변수
			// 지역변수 : 특정영역(scope)에서만 사용할 수 있는 변수
			// 전역변수 : 클래스 전체에서 사용할 수 있는 변수
			// 특정영역을 구분하는 방법 : {영역}

		}
	}
}

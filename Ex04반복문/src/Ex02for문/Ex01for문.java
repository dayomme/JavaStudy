package Ex02for문;

public class Ex01for문 {

	public static void main(String[] args) {

		// 1. for문을 사용해서 21에서 57까지 출력
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 개행

		// 2.for문을 사용하여 96에서 53까지 출력
		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println(); // 개행

		// 3.for문을 사용하여 21에서 57까지 홀수만 출력

		// 3-1 시작점 21 도착점 57 보폭+2
		for (int i = 21; i <= 57; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3-2 판단(조건식) 21 ~ 57
		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}

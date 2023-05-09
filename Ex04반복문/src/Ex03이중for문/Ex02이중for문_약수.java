package Ex03이중for문;

public class Ex02이중for문_약수 {

	public static void main(String[] args) {

		for (int i = 2; i <= 30; i++) {
			System.out.printf("%d의 약수 : ", i);

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.printf("%d ", j);
				}

			}
			System.out.println();
		}
	}
}

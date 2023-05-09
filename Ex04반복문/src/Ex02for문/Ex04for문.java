package Ex02for문;
import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {

		// 입력받은 정수의 약수를 구하세요.
		// 정수 입력 : __
		// __의 약수 : 1..

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		System.out.print("32의 약수 :");
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.print(i + " ");

				// 1. 자기보다 큰 수를 약수로 가지고 있지 않음
				// 2. 모든 숫자들의 가장 작은 약수는 1
				// +32 : 1 2 4 8 16 32
				// +24 : 1 2 3 4 6 8 12 24
				// 자기 자신의 절반 ~ 자기자신 사이에 약수는 존재하지 않는다.

			}

		}
	}

}

import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습_랜덤값 {

	public static void main(String[] args) {

		// 랜덤 객체
		// 레퍼런스 변수
		Random rd = new Random();

		// 크기가 10인 1차원 정수형 배열 선언
		int[] arr = new int[10];
		// 정수배열을 선언 기본값 0

		// 배열 랜덤값 초기화 -> 최대최소 for문이 아닌 별도로 작성
		// 이유 : 정수배열 선언 기본값이 0이기 때문
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;
			System.out.printf("%d ", arr[i]);
		}

		// 최대값 최소값 변수 선언
		int max = arr[0]; // 내가 지금까지 본 숫자중에 가장 큰 숫자
		int min = arr[0]; // 내가 지금까지 본 숫자중에 가장 작은 숫자

		// 반복문
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) { // 최대값
				max = arr[i];
			} else if (min > arr[i]) { // 최소값
				       min = arr[i];
			}

		}

		// 출력
		System.out.printf("\n가장 큰 값 : %d\n", max);
		System.out.printf("가장 작은 값 : %d", min);

	}

}

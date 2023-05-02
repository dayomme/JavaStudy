import java.util.Scanner;

public class Ex04배열실습4 {

	public static void main(String[] args) {

		// 스캐너
		Scanner sc = new Scanner(System.in);

		// 입력된 점수 출력 - 배열 이용?
		int[] arr = new int[5]; // arr에 5개의 공간을 만들겠다

		// 변수선언

		// 1~5번째 입력 (반복문)
		for (int i = 1; i <= arr.length; i++) {
			System.out.printf("%d번째 입력 >> ", i);
			// 입력받은 값을 배열에 넣기
			arr[i - 1] = sc.nextInt();
		}

		int max = arr[0]; // 최고점수
		int min = arr[0]; // 최저점수
		int sum = 0; // 총 합

		System.out.print("입력된 점수 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최고 점수 :" + max);
		System.out.println("최저 점수 :" + min);
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + (double) sum / arr.length);

	}

}

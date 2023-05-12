package 정렬;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {

		int[] arr = { 98, 7, 70, 13, 24 };

		System.out.println("정렬전 : " + Arrays.toString(arr));

		int temp; // 치환시 사용
		int index = 0; // 내가 지금까지 본 숫자중에 가장 작은 수의 인덱스 번호 기억

		for (int j = 0; j < arr.length - 1; j++) { // 배열안 에 숫자 개수 -1 회차( 5 -> 4회차)
			index = j; // 1회차 -0, 2회차 -1, 3회차 - 2, 4회차 -3
			for (int i = index + 1; i < arr.length; i++) {
				if (arr[index] > arr[i]) {
					index = i; // 두번째로 작은숫자가 존재하는 인덱스 번호
				}
			}
			// 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
			temp = arr[j];
			arr[j] = arr[index];
			arr[index] = temp;

			System.out.println(j+1 + "차 정렬후 : " + Arrays.toString(arr));

		}

	}
}

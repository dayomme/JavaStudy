package 탐색;

import java.util.Arrays;

public class Ex03이진탐색실습 {

	public static void main(String[] args) {

		int[] array = { 10, 24, 7, 68, 42, 82, 3, 43, 22, 84 };

		// 선택_오름차순
		// 필요한 변수 2개
		// 1. 치환
		int temp;
		// 2. 가장 작은 값을 가진 인덱스의 값이 저장될 변수
		int index;

		for (int i = 0; i < array.length - 1; i++) {
			index = i;
			for (int j = i; j < array.length; j++) {
				if (array[index] > array[1]) {
					index = j;
				}
			}

			// 치환
			// 제일 작은 값을 0번 인텍스로 보내자 / 두번째로 작은값 1번인덱스
			if (i != index) {
				// 원래 숫자의 자리와 제일 작은 숫자가 저장된 자리가 다를때만 치환
				temp = array[index];
				array[index] = array[i];
				array[i] = temp; // 0번인덱스에 가장 작은값이 들어온 상태
			}

		}
		// 오름차순
		// 이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어있어야 한다!

		int num = 68;

		int lowIndex = 0;
		int highIndex = array.length - 1;

		while (true) {
			int middleIndex = (highIndex + lowIndex) / 2;
			// 1. middle에있는 데이터랑 num이랑 같은지 판단
			if (array[middleIndex] == num) {
				System.out.println(middleIndex);
				break;
			} else {
				// mid에 있는 값보다 작은지? 큰지?
				// low, high값을 재설정
				if (array[middleIndex] > num) {
					highIndex = middleIndex - 1;
				} else {
					// arr[mid] < num
					lowIndex = middleIndex + 1;
				}

			}

		}

	}

}

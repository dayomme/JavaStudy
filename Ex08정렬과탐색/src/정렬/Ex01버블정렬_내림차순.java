package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_내림차순 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 5, 7 };
		// int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };
		System.out.println("정렬 전 : " + Arrays.toString(arr));

		int temp; // 치환을 위한 임시공간
		boolean sw = false; // n회차 정렬이 한번이라도 일어나면 true !!

		
		
		// 한 번의 반복이 완료될때 마다 가장 큰 수는 배열의 가장 마지막 부분으로 밀리는것이 보장 
		for (int j = 0; j < arr.length - 1; j++) {
			// 따라서 한 번의 반복마다 가장 뒤의 인덱스는 비교하지 않도록 반복문 설계 
			sw = false;
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] < arr[i + 1]) {
					// 만일 앞의 수가 뒤의 수보다 더 크다면 temp로 치환 
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sw = true;
				}
			}

			if (!sw) { // sw가 false 일때만 수행(n회차 한번도 바뀌지 않았을 때!)
				break;
			}

			System.out.println((j + 1) + "회차 : " + Arrays.toString(arr));
		}
	}

}

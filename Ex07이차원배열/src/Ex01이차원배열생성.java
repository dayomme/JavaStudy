
public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		int[][] arr = new int[3][5]; // 배열생성성시 크기 무조건 지정
		// 일차원배열 3개 -> 5칸(길이 5)
		// 레퍼런스배열 1개 -> 길이 3
		// -> 3행 5열 행렬 구조
		// int형배열 -> 초기화를 하지않으면 기본 0

		arr[0][0] = 10;
		// arr[0] =1; -> 레퍼런스 배열 초기화는 불가능
		System.out.println(arr[0][0]);

		char[][] charArr = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
		System.out.println(charArr.length); // 레퍼런스배열의 길이
											// 일차원배열이 몇개? 2
		System.out.println(charArr[0].length); // 일차원배열의 길이? 3

		int[][] arr2 = new int[5][5];

		int num = 1;
		for (int j = 0; j < arr2.length; j++) { // 반복 -> 1개의 행을 다룬다
			for (int i = 0; i < arr2[j].length; i++) { // 1차원배열 하나 초기화
												// 1개의 행의 각 (실제)데이터를 다룬다
				arr2[j][i] = num++;
			}

		}

		// 반복문에 잘들어갔는지 출력
		for (int j = 0; j < arr2.length; j++) {
			for (int i = 0; i < arr2[j].length; i++) {
				System.out.print(arr2[j][i] + " " + "\t");
				// "\t" : 탭키 -> 일정하게 보여줌
			}
			System.out.println();
		}

	}

}

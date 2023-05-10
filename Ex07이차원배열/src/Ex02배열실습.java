
public class Ex02배열실습 {

	public static void main(String[] args) {

		// 배열생성, 레퍼런스 변수 선언
		int[][] arr = new int[4][6];
        
		// 변수 초기화 
		int num = 21;
		
		// 21 ~ 숫자로 배열 초기화 
		// 이중 for문 : i -> j -> k
		for (int i = 0; i < arr.length; i++) { // 총 4개의 1차원 배열을 다룰 수 있도록 함
			for (int j = 0; j < arr[i].length; j++) { // 1개의 1차원 배열을 다룰 수 있음(6칸)
				arr[i][j] = num;
				num++;
			}
		}

		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}

	}

}

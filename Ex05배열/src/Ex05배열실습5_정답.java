import java.util.Scanner;

public class Ex05배열실습5_정답 {

	public static void main(String[] args) {

		// 이 배열안에 들어있는 값이 중복되지 않는다! (가정)
		Scanner sc = new Scanner(System.in);

		String[] arrStr = { "a", "b", "c", "d", "e" };

		System.out.print("검색할 값 입력 >> ");
		String data = sc.next();

		for (int i = 0; i < arrStr.length; i++) {
			// == : 기본타입(primitive type) 비교시에만 사용
			// int char long byte short float boolean double

			// 같은게 발견되었더라도 계속 for문이 돌기때문에 break를 걸어줌!
			if (data.equals(arrStr[i])) {
				System.out.println(data + "는 " + i + "번째 인덱스에 저장되어 있습니다");
				break; // 가장 가까운 반복문 나가는 키워드!
			}

		}

	}

}

import java.util.Scanner;

public class Ex05배열실습5_문자열 {

	public static void main(String[] args) {

		// 스캐너
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.print("검색할 이름 입력 >> ");
		String name = sc.next();

		// 배열
		String[] arrStr = { "김지은", "박수현", "정세연", "이명훈", "강예진", "임명진", "정형", "채수민" };

		// 반복문
		for (int i = 0; i < arrStr.length; i++) {
			if (name.equals(arrStr[i])) {
				System.out.printf("%s님은 %d번째 인덱스에 저장되어 있습니다", name, i);
			}

		}

	}

}

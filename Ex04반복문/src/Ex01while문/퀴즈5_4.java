package Ex01while문;
import java.util.Scanner;

public class 퀴즈5_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String id = "smhrd"; // 아이디 비밀번호를 상수(변하지않는 수)처리
		final String pw = "1234";
		int num = 1; // 로그인 횟수

		while (true) {
			System.out.print("아이디 : ");
			String inputid = sc.next();

			System.out.print("비밀번호: ");
			String inputpw = sc.next();

			if (id.equals(inputid) && pw.equals(inputpw)) {
				System.out.println("로그인 성공!");
				break;
			} else {
				num++;
				if (num > 3) {
					System.out.println("로그인실패\n본인인증을 해주세요");
					break;
				}
				System.out.print("로그인 실패\n계속 하시겠습니까?");
				String ans = sc.next();

				if (ans.equals("N")) {
					break;
				}

			}
		}

	}
}

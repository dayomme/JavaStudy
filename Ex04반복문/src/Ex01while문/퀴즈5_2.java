package Ex01while문;
import java.util.Scanner;

public class 퀴즈5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String id = "smhrd"; // 아이디 비밀번호를 상수(변하지않는 수)처리
		final String pw = "1234";

		String inputid, inputpw; // 입력받은 아이디 비밀번호

		while (true) {
			System.out.print("아이디 : ");
			inputid = sc.next();

			System.out.print("비밀번호: ");
			inputpw = sc.next();

			if (id.equals(inputid) && pw.equals(inputpw)) {
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("로그인 실패");
			}

		}

	}


	}


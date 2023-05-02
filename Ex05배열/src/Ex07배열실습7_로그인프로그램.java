import java.util.Scanner;

public class Ex07배열실습7_로그인프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu; // 변수 선언(공간을 만든다)
		String id;// 현재 로그인하는 사용자의 아이디
		String pw; // 현재 로그인하는 사용자의 비밀번호
		int cnt = 0; // 현재까지 회원가입한 사용자의 카운팅
		boolean sw = true; // true : 로그인불가 / false : 로그인가능

		String[] idArray = new String[3];
		String[] pwArray = new String[3];

		// 메뉴 무한 반복 -> while
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			menu = sc.nextInt();

			// 아이디 비밀번호 잘 들어갔는지 확인
			System.out.println("아이디 : ");
			for (String i : idArray) {
				System.out.print(i + " ");
			}
			System.out.println("비밀번호: ");
			for (String i : pwArray) {
				System.out.print(i + " ");
			}
			System.out.println();

			if (menu == 1) { // 회원가입
				System.out.println("===회원가입===");

				if (cnt == 3) {
					System.out.println("회원가입 불가!");
				} else {
					System.out.print("ID : ");
					idArray[cnt] = sc.next();
					System.out.print("PW : ");
					pwArray[cnt] = sc.next();

					// [가입할때마다 변해야함 -> 변수]
					// idArray[cnt] = id;
					// pwArray[cnt] = id;
					cnt++; // 그 다음 회원가입하는 사람은 그 다음 인덱스에 저장되도록!
				}

			} else if (menu == 2) { // 로그인
				System.out.println("===로그인===");

				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PW : ");
				pw = sc.next();

				for (int i = 0; i < cnt; i++) {

					if (idArray[i].equals(id) && pwArray[i].equals(pw)) {
						System.out.println("로그인성공!");
						sw = false;
						break; // 회원정보가 겹치지 않으니 가입하는 순간 더이상 확인하지 않게!
					}

					if (sw) {
						System.out.println("로그인실패!");
					}

				}

			} else { // 종료
				System.out.println("종료");
				break;
			}

		}

	}
}

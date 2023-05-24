package Ex16인터페이스;

import java.util.ArrayList;
import java.util.Scanner;

import 숫자게임만들기.Member;
import 숫자게임만들기.PlusGame;

public class Main {

	public static void main(String[] args) {

		// 1. PlusGame을 진행할 수 있도록 객체 생성하기
		PlusGame game = new PlusGame();
		Scanner sc = new Scanner(System.in);

		// Memger자료형을 관리하는 ArrayList 선언/초기화
		ArrayList<Member> members = new ArrayList<>();

		int round = 1; // 게임라운드 체크를 위한 변수
		boolean check = false; // 로그인을 성공/실패 변수
		boolean check2 = false; // 로그인을 성공/실패 변수
		int cnt = 1; // 3번의 정답의 기회를 체크할 변수

		while (round < 6) {

			// 회원가입, 로그인을 했을경우 게임이 실행되도록 만들자!
			// 회원가입진행 ---> 로그인을 성공했으면

			if (check == false) {
				System.out.println("[1]회원가입 [2]로그인 >> ");
				int select1 = sc.nextInt();
				if (select1 == 1) {
					// 회원가입
					System.out.println("닉네임 : ");
					String nick = sc.next();
					System.out.println("비밀번호 : ");
					String pw = sc.next();
					// Member 자료형으로 nick, pw를 묶어주자
					Member mem = new Member(nick, pw);
					// ArrayList ---> 회원 정보들을 관리하는
					members.add(mem);
					System.out.println("회원가입 성공");
					// while문 처음으로 돌아가는 키워드
					continue;
				} else {
					// 로그인
					System.out.println("닉네임 : ");
					String nick = sc.next();
					System.out.println("비밀번호 : ");
					String pw = sc.next();

					for (int i = 0; i < members.size(); i++) {
						// 사용자가 입력한 닉네임, 비번과 일치하는 데이터가 있는지!
						if (members.get(i).getNick().equals(nick) && members.get(i).getPw().equals(pw)) {
							// 로그인 성공
							System.out.println("로그인 성공!");
							// 더이상 로그인이나, 회원가입 코드가 실행될 필요가 없어요
							check = true;
						} else {
							// 로그인실패
							System.out.println("로그인 실패");
							check2 = false;
							break;
						}

					}
					if (check2 == false) {
						// 다시 화면 볼수있도록
						continue;
					}

				}
			}

			// 5라운드까지만 동작할 수 있도록 만들자!
			// 문제를 출제
			String quiz = game.getQuizMsg();
			// ---> 문제정답을 틀렸을때 똑같은 문제를 다시 출제
			// 몇라운드인지!
			System.out.print(round + "라운드 " + quiz);
			// 정답입력받기
			int ans = sc.nextInt();
			// 맞는지, 틀린정답인지 확인 : checkAnswer(int ans)
			boolean ck = game.checkAnswer(ans); // true/false

			if (ck == false) {
				// 틀렸다면
				// 총 3번의 기회를 더 준다 !! -> 같은문제를 풀수있는
				while (cnt < 4) {
					// cnt가 4보다 작을동안 동작
					// 만약 +1씩 증가시키면 총 3번까지 동작할 수 있는 while문
					System.out.println("틀렸습니다.");
					// 위에 출제되었던 문제 그대로 출력
					System.out.println(round + "라운드 : " + quiz);
					ans = sc.nextInt();
					ck = game.checkAnswer(ans);
					if (ck == true) {
						break;
					}
					cnt++;
				}

			} else {
				// 정답이라면
				System.out.println("정답입니다.");
			}

			// 라운드 종료!!
			round++;
			System.out.println();

		}

	}

}